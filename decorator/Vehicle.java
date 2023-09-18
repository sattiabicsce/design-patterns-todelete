package decorator;

import java.util.ArrayList;

/**
 * The {@code Vehicle} class represents a base vehicle with lines of text.
 * It serves as the foundation for creating and decorating vehicles.
 */
class Vehicle {
    /**
     * The lines of text that make up the appearance of the vehicle.
     */
    protected ArrayList<String> lines;

    /**
     * Constructs a {@code Vehicle} with the provided lines.
     *
     * @param lines The lines of text that define the appearance of the vehicle.
     */
    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Converts the vehicle into a string representation by joining its lines with newline characters.
     *
     * @return A string representation of the vehicle.
     */
    @Override
    public String toString() {
        StringBuilder carString = new StringBuilder();
        for (String line : lines) {
            carString.append(line).append("\n");
        }
        return carString.toString();
    }
}
