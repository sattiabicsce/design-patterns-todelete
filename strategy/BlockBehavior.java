package strategy;

class BlockBehavior implements DefenseBehavior {
    @Override
    public String play() {
        return "Block Defenders";
    }
}