package factory;

public class BikeStore {
    
    /**
     * Creates a new instance of a bike based on the specified bike type.
     *
     * @param type The type of bike to create (e.g., "tricycle", "strider", "kids bike").
     * @return An instance of the specified type of bike.
     * @throws IllegalArgumentException if the provided bike type is invalid.
     */
    public Bike createBike(String type) {
        if (type.equalsIgnoreCase("tricycle")) {
            return new Tricycle();
        } else if (type.equalsIgnoreCase("strider")) {
            return new Strider();
        } else if (type.equalsIgnoreCase("kids bike")) {
            return new KidsBike();
        } else {
            throw new IllegalArgumentException("Invalid bike type");
        }
    }
}
