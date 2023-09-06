package strategy;

class PassBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "Throw a pass";
    }
}