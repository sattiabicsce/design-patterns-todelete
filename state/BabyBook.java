package state;

import java.util.ArrayList;

/**
 * Represents the BabyBook application, managing its states and interactions.
 */
class BabyBook {
    private State currentState;

    /**
     * Constructor for the BabyBook class. Initializes the states with the default being English.
     */
    public BabyBook() {
        // Initialize states
        currentState = new EnglishState(this);
    }

    /**
     * Presses the button to switch the BabyBook application to the English state.
     */
    public void pressEnglishButton() {
        currentState.pressEnglishButton();
    }

    /**
     * Presses the button to switch the BabyBook application to the Spanish state.
     */
    public void pressSpanishButton() {
        currentState.pressSpanishButton();
    }

    /**
     * Presses the button to switch the BabyBook application to the French state.
     */
    public void pressFrenchButton() {
        currentState.pressFrenchButton();
    }

    /**
     * Presses the button associated with a specific animal, producing the corresponding animal sound.
     *
     * @param animal The name of the animal whose button is pressed.
     */
    public void pressAnimalButton(String animal) {
        currentState.pressAnimalButton(animal);
    }

    /**
     * Gets the list of animals in the current state.
     *
     * @return An ArrayList containing the names of animals in the current state.
     */
    public ArrayList<String> getAnimalList() {
        return currentState.getAnimalList();
    }

    /**
     * Sets the current state of the BabyBook application.
     *
     * @param state The new state to set.
     */
    public void setState(State state) {
        this.currentState = state;
    }

    /**
     * Gets a new instance of the English state.
     *
     * @return A new instance of the English state.
     */
    public State getEnglishState() {
        return new EnglishState(this);
    }

    /**
     * Gets a new instance of the Spanish state.
     *
     * @return A new instance of the Spanish state.
     */
    public State getSpanishState() {
        return new SpanishState(this);
    }

    /**
     * Gets a new instance of the French state.
     *
     * @return A new instance of the French state.
     */
    public State getFrenchState() {
        return new FrenchState(this);
    }
}
