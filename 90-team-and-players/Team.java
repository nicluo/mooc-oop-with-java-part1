import java.util.ArrayList;

/**
 * Implement a class Team. At this stage team has only a name (String) and the following functionality:
 * a constructor that sets the team name
 * getName, that returns the name
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    /**
     * Add to the class Team the following methods:
     * addPlayer, adds a player to the team
     * printPlayers, prints the players in the team
     * You should store the players to an instance variable of the type ArrayList<Player> within the class Team.
     */
    public void addPlayer(Player p) {
        if (this.size() < this.maxSize) {
            this.players.add(p);
        }
    }

    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    /**
     * Add to the class Team the methods
     * setMaxSize(int maxSize), sets the maximum number of players that the team can have
     * size, returns the number of players in the team
     */
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    /**
     * Add to the class Team the method
     * goals, returns the total number of goals for all the players in the team
     */
    public int goals() {
        int goalsTotal = 0;
        for (Player p : players) {
            goalsTotal += p.goals();
        }
        return goalsTotal;
    }
}
