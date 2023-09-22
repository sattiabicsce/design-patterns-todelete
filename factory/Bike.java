package factory;

public abstract class Bike {
    protected String name;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Initializes a new Bike with the specified attributes.
     *
     * @param name             The name of the bike.
     * @param numWheels        The number of wheels on the bike.
     * @param hasPedals        Indicates whether the bike has pedals.
     * @param hasTrainingWheels Indicates whether the bike has training wheels.
     */
    public Bike(String name, int numWheels, boolean hasPedals, boolean hasTrainingWheels) {
        this.name = name;
        this.numWheels = numWheels;
        this.hasPedals = hasPedals;
        this.hasTrainingWheels = hasTrainingWheels;
    }

    /**
     * Assembles the bike, specifying the steps to create the bike.
     *
     * @return A String representation of the bike assembly process.
     */
    public abstract String assembleBike();

    /**
     * Creates the frame of the bike.
     *
     * @return A String indicating the frame assembly step.
     */
    protected String createFrame() {
        return "- Assembling " + name + " frame";
    }

    /**
     * Adds the wheels to the bike.
     *
     * @return A String indicating the wheel assembly step.
     */
    protected String addWheels() {
        return "- Adding " + numWheels + " wheel(s)";
    }

    /**
     * Adds the pedals to the bike.
     *
     * @return A String indicating the pedal assembly step.
     */
    protected String addPedals() {
        return "- Adding pedals";
    }

    /**
     * Adds training wheels to the bike.
     *
     * @return A String indicating the training wheel assembly step.
     */
    protected String addTrainingWheels() {
        return "- Adding training wheels";
    }
}
