package strategy;

import java.util.Random;

/**
 * The Quarterback class represents a football player who plays as a quarterback.
 * Quarterbacks have a 50% chance of selecting RunBehavior and a 50% chance of selecting PassBehavior for offense.
 */
class Quarterback extends Player {
    private Random random = new Random();

    /**
     * Constructs a new Quarterback with the given attributes.
     */
    public Quarterback(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
    }

    /**
     * Sets the offense behavior for quarterbacks. They have a 50% chance of selecting RunBehavior and 50% chance of selecting PassBehavior.
     */
    @Override
    public void setOffenseBehavior() {
        if (random.nextBoolean()) {
            offenseBehavior = new RunBehavior();
        } else {
            offenseBehavior = new PassBehavior();
        }
    }

    /**
     * Quarterbacks do not have a specific defense behavior, so this method sets it to null.
     */
    @Override
    public void setDefenseBehavior() {
        defenseBehavior = null;
    }
}
