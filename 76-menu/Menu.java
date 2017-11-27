import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    /**
     * 75.1: Implement the method public void addMeal(String meal) that adds a new meal to the list this.meals of a Menu
     * object. If the meal is already in the list, it should not be added.
     */
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    /**
     * 75.2: Implement the method public void printMeals() that prints the meals in a menu.
     */
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    /**
     * Implement the method public void clearMenu() that clears a menu. After calling this method, the menu should be
     * empty. Class ArrayList has a method that is useful here.
     */
    public void clearMenu() {
        this.meals.clear();
    }
}
