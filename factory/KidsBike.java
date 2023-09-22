package factory;

public class KidsBike extends Bike {
    public KidsBike() {
        super("Kids Bike", 2, true, true);
    }

    @Override
    public String assembleBike() {
        String result = createFrame() + "\n" + addWheels() + "\n" + addPedals();
        return "Assembling a Kids Bike:\n" + result;
    }
}
