package strategy;

class OBlockBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "Block for the ball carrier";
    }
}