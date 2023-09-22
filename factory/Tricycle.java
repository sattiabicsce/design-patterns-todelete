package factory;

public class Tricycle extends Bike {
    public Tricycle() {
        super("Tricycle", 3, true, false);
    }

    @Override
    public String assembleBike() {
        String result = createFrame() + "\n" + addWheels() + "\n" + addPedals();
        return "Assembling a Tricycle:\n" + result;
    }
}
