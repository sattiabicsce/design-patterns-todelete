package strategy;

/**
 * The Receiver class represents a football player who plays as a receiver.
 * Receivers have specific offensive behavior, which is set to ReceiveBehavior.
 */
class Receiver extends Player {
    /**
     * Constructs a new Receiver with the given attributes.
     */
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    /**
     * Sets the specific offense behavior for receivers as ReceiveBehavior.
     */
    @Override
    public void setOffenseBehavior() {
        this.offenseBehavior = new ReceiveBehavior();
    }

    /**
     * Receivers do not have a specific defense behavior, so this method sets it to null.
     */
    @Override
    public void setDefenseBehavior() {
        this.defenseBehavior = null;
    }
}
