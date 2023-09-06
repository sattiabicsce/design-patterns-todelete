package strategy;

import java.util.Random;

/**
 * The Lineman class represents a football player who plays as a lineman.
 * Linemen have specific offensive behavior, which is set to OBlockBehavior.
 */
class Lineman extends Player {
    private Random random = new Random();

    /**
     * Constructs a new Lineman with the given attributes.
     */
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    /**
     * Sets the specific offense behavior for linemen as OBlockBehavior.
     */
    @Override
    public void setOffenseBehavior() {
        this.offenseBehavior = new OBlockBehavior();
    }

    /**
     * Sets the defense behavior for linemen. They have a 1/3 chance of selecting BlockBehavior, StripBehavior, or SackBehavior.
     */
    @Override
    public void setDefenseBehavior() {
        int randomChoice = random.nextInt(3);
        switch (randomChoice) {
            case 0:
                defenseBehavior = new BlockBehavior();
                break;
            case 1:
                defenseBehavior = new StripBehavior();
                break;
            case 2:
                defenseBehavior = new SackBehavior();
                break;
        }
    }
}
