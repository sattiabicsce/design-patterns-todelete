package strategy;

class ReceiveBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "Catch the pass";
    }
}