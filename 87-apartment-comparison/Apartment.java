public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    /**
     * Implement the method public boolean larger(Apartment otherApartment) that returns true if the Apartment object
     * for which the method is called (this) is larger than the apartment object given as parameter (otherApartment).
     */
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    /**
     * Implement the method public int priceDifference(Apartment otherApartment) that returns the absolute value of the
     * price difference of the Apartment object for which the method is called (this) and the apartment object given as
     * parameter (otherApartment). The price of an apartment is squareMeters * pricePerSquareMeter.
     */
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.price() - otherApartment.price());
    }

    public int price() {
        return this.squareMeters * this.pricePerSquareMeter;
    }

    /**
     * Implement the method public boolean moreExpensiveThan(Apartment otherApartment) that returns true if the
     * Apartment-object for which the method is called (this) has a higher price than the apartment object given as
     * parameter (otherApartment).
     */
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.price() > otherApartment.price();
    }
}