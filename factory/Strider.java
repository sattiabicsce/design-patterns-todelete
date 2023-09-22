package factory;

public class Strider extends Bike {
    public Strider() {
        super("Strider", 2, false, false);
    }

    @Override
    public String assembleBike() {
        String result = createFrame() + "\n" + addWheels();
        return "Assembling a Strider:\n" + result;
    }
}
