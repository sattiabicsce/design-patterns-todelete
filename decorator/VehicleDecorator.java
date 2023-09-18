package decorator;

import java.util.ArrayList;

/**
 * The {@code VehicleDecorator} class is a decorator for a vehicle, allowing the integration of decoration lines
 * with the base vehicle's lines. It ensures that text files overlap each other starting on the same line without
 * additional spaces, and overwrites spaces with characters from the decoration lines.
 */
class VehicleDecorator extends Vehicle {
    /**
     * Constructs a {@code VehicleDecorator} with the provided lines.
     *
     * @param lines The base lines of the vehicle.
     */
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /**
     * Integrates decoration lines into the base vehicle lines, ensuring they overlap correctly.
     *
     * @param decor The decoration lines to integrate.
     */
    public void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < Math.min(lines.size(), decor.size()); i++) {
            String line = lines.get(i);
            String decoration = decor.get(i);

            StringBuilder mergedLine = new StringBuilder();
            for (int j = 0; j < Math.max(line.length(), decoration.length()); j++) {
                char vehicleChar = (j < line.length()) ? line.charAt(j) : ' ';
                char decorChar = (j < decoration.length()) ? decoration.charAt(j) : ' ';

                if (decorChar == ' ') {
                    // If the decoration has a blank, use the vehicle character
                    mergedLine.append(vehicleChar);
                } else {
                    // Otherwise, use the decoration character
                    mergedLine.append(decorChar);
                }
            }

            lines.set(i, mergedLine.toString());
        }
    }
}
