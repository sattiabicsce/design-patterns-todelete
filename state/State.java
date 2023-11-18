package state;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract base class representing different states in the BabyBook application.
 */
abstract class State {
    /** The BabyBook instance associated with this state. */
    protected BabyBook book;
    
    /** HashMap to store animal sounds in the current state. */
    protected HashMap<String, String> animalSounds;

    /**
     * Constructor for the State class.
     *
     * @param book The BabyBook instance associated with this state.
     */
    public State(BabyBook book) {
        this.book = book;
        this.animalSounds = new HashMap<>();
    }

    /**
     * Gets the list of animals in the current state.
     *
     * @return An ArrayList containing the names of animals in the current state.
     */
    public abstract ArrayList<String> getAnimalList();

    /**
     * Presses the button associated with a specific animal, producing the corresponding animal sound.
     *
     * @param animal The name of the animal whose button is pressed.
     */
    public abstract void pressAnimalButton(String animal);

    /**
     * Presses the button to switch the BabyBook application to the English state.
     */
    public abstract void pressEnglishButton();

    /**
     * Presses the button to switch the BabyBook application to the Spanish state.
     */
    public abstract void pressSpanishButton();

    /**
     * Presses the button to switch the BabyBook application to the French state.
     */
    public abstract void pressFrenchButton();
}
