/**
 * Create a class Product that represents a product sold in a webshop. A product has a price, amount and name.
 *
 * The class should have:
 *
 * A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
 * A method public void printProduct() that prints a product in the following form:
 *
 * Banana, price 1.1, amount 13
 *
 */
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
