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
     * Add to the class MyDate the method public int differenceInYears(MyDate comparedDate), that calculates the
     * difference in years of the object for which the method is called and the object given as parameters.
     *
     * Modify the method so that it works no matter which date is later, the one for which the method is called or the parameter.
     */
    public int differenceInYears(MyDate comparedDate) {
        /** 92.1
         * return this.year - comparedDate.year;
         */

        MyDate earlierDate, laterDate;
        if (this.earlier(comparedDate)) {
            earlierDate = this;
            laterDate = comparedDate;
        } else {
            earlierDate = comparedDate;
            laterDate = this;
        }

        int yearsDifferent = laterDate.year - earlierDate.year;

        if (laterDate.month == earlierDate.month) {
            if (laterDate.day <= earlierDate.day) {
                yearsDifferent--;
            }
        } else if (laterDate.month < earlierDate.month) {
            yearsDifferent--;
        }

        return yearsDifferent;
    }
}
