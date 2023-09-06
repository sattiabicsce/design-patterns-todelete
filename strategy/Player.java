package strategy;

/**
 * The abstract Player class represents a football player in the game.
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    private DefenseBehavior defenseBehavior;
    private OffenseBehavior offenseBehavior;

    /**
     * Constructs a new Player with the given attributes.
     *
     * @param firstName The first name of the player.
     * @param lastName  The last name of the player.
     * @param offense   A boolean indicating whether the player is on offense (true) or defense (false).
     */
    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * Sets the defense behavior based on the player's role.
     */
    public void setDefenseBehavior() {
        if (offense) {
            defenseBehavior = new BlockBehavior();
        } else {
            defenseBehavior = new SackBehavior();
        }
    }

    /**
     * Sets the offense behavior based on the player's role.
     */
    public void setOffenseBehavior() {
        if (offense) {
            offenseBehavior = new PassBehavior();
        } else {
            offenseBehavior = new ReceiveBehavior();
        }
    }

    /**
     * Performs a play action based on the player's role (offense or defense).
     *
     * @return A String describing the play action.
     */
    public String play() {
        if (offense) {
            return offenseBehavior.play();
        } else {
            return defenseBehavior.play();
        }
    }

    /**
     * Handles a turnover event for the player.
     */
    public void turnover() {
        System.out.println(firstName + " " + lastName + " turnover");
    }

    /**
     * Gets the defense behavior of the player.
     *
     * @return The player's defense behavior.
     */
    protected DefenseBehavior getDefenseBehavior() {
        return defenseBehavior;
    }

    /**
     * Gets the offense behavior of the player.
     *
     * @return The player's offense behavior.
     */
    protected OffenseBehavior getOffenseBehavior() {
        return offenseBehavior;
    }

    /**
     * Returns a string representation of the player.
     *
     * @return A string containing the player's full name.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
