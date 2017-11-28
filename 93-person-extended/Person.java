import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return this.birthday.differenceInYears(new MyDate(day, month, year));
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

    /**
     * Add to the class Person the method boolean olderThan(Person compared) which compares the ages of the object for
     * which the method is called and the object given as parameter. The method returns true if the object itself is
     * older than the parameter.
     */
    public boolean olderThan(Person compared) {
        return this.birthday.earlier(compared.birthday);
    }

    /**
     * Add to the class Person two new constructors:
     * public Person(String name, MyDate birthday) constructor sets the given MyDate-object to be the birthday of the
     * person
     * public Person(String name) constructor sets the current date (i.e., the date when the program is run) to be the
     * birthday of the person
     */
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(day, month, year);
    }
}
  