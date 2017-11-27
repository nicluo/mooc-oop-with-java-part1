import java.util.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");
        menu.printMeals();

        menu.clearMenu();
        menu.addMeal("Hot Dog");
        menu.printMeals();
    }
}
