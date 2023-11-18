package state;

import java.util.ArrayList;

/**
 * Represents the French state in the BabyBook application.
 */
class FrenchState extends State {

    /**
     * Constructor for the FrenchState class.
     *
     * @param book The BabyBook instance associated with this state.
     */
    public FrenchState(BabyBook book) {
        super(book);
        // Initialize French animal sounds
        animalSounds.put("oiseau", "Cui Cui");
        animalSounds.put("chat", "Miaou");
        animalSounds.put("poulet", "Cotcotcodet");
        animalSounds.put("chien", "Ouaf Ouaf");
        animalSounds.put("cheval", "NeHiiiiigh");
        animalSounds.put("souris", "Chicotement");
        animalSounds.put("mouton", "Bêlement");
    }

    /**
     * Gets the list of animals in the French language.
     *
     * @return An ArrayList containing the names of animals in French.
     */
    @Override
    public ArrayList<String> getAnimalList() {
        return new ArrayList<>(animalSounds.keySet());
    }

    /**
     * Presses the button associated with a specific animal in the French state,
     * producing the corresponding animal sound.
     *
     * @param animal The name of the animal whose button is pressed.
     */
    @Override
    public void pressAnimalButton(String animal) {
        System.out.println(animalSounds.get(animal));
    }

    /**
     * Switches the BabyBook application to the English state.
     */
    @Override
    public void pressEnglishButton() {
        // Switch to English state
        book.setState(book.getEnglishState());
    }

    /**
     * Switches the BabyBook application to the Spanish state.
     */
    @Override
    public void pressSpanishButton() {
        // Switch to Spanish state
        book.setState(book.getSpanishState());
    }

    /**
     * Displays a message indicating that the application is already in the French state.
     */
    @Override
    public void pressFrenchButton() {
        // Already in French state
        System.out.println("Already in French state");
    }
}
