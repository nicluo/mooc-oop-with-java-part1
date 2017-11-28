public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    /**
     * Add to the class MyDate the method public void advance() that advances the date by one.
     * Note: In this assignment we assume that all the months have 30 days!
     */
    public void advance() {
        day++;
        if (day == 31) {
            day = 1;
            month++;
            if (month == 13) {
                month = 1;
                year++;
            }
        }
    }

    /**
     * Add also overloaded version public void advance(int numberOfDays). This method should advance the day by the
     * number given as parameter. Implement this method so that it calls the method advance() that was defined in the
     * previous part of the assignment, e.g. the call advance(5) should call advance() 5 times.
     */
    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            this.advance();
        }
    }

    /**
     * Add to the class MyDate the method MyDate afterNumberOfDays(int days), that returns a new MyDate-object that has
     * the date which equals the date of the object for which the method was called advance by the parameter of the
     * method days.
     */
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }
}
