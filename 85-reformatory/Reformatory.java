public class Reformatory {
    private int totalWeightsMeasured;

    public Reformatory() {
        this.totalWeightsMeasured = 0;
    }

    public int weight(Person person) {
        this.totalWeightsMeasured++;

        // Returns the weight of the parameter
        return person.getWeight();
    }

    /**
     * Add to class Reformatory the method public void feed(Person person) that increases the weight of its parameter
     * by one.
     */
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    /**
     * Add to class Reformatory the method public int totalWeightsMeasured() that returns the total number of times a
     * weight has been measured.
     */
    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured;
    }
}
