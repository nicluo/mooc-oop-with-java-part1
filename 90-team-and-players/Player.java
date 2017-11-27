/**
 * Create a class Player with the instance variables for the player name and the amount of goals. A player should have
 * two constructors: one that initializes the name and an another that initializes the name and the amount of goals.
 * Implement also the following methods:
 * getName, returns the player name
 * goals, returns the amount of goals
 * toString, returns a string representation that is formed as in the example below
 */
class Player {
    private String name;
    private int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    public String toString() {
        return name + ", goals " + goals;
    }
}
