package state;

import java.util.ArrayList;

/**
 * Represents the English state in the BabyBook application.
 */
class EnglishState extends State {

    /**
     * Constructor for the EnglishState class.
     *
     * @param book The BabyBook instance associated with this state.
     */
    public EnglishState(BabyBook book) {
        super(book);
        // Initialize English animal sounds
        animalSounds.put("bird", "Tweet");
        animalSounds.put("cat", "Meow");
        animalSounds.put("chicken", "Cluck");
        animalSounds.put("dog", "Woof");
        animalSounds.put("horse", "Neigh");
        animalSounds.put("mouse", "Sqeek");
        animalSounds.put("sheep", "Baah");
    }

    /**
     * Gets the list of animals in the English language.
     *
     * @return An ArrayList containing the names of animals in English.
     */
    @Override
    public ArrayList<String> getAnimalList() {
        return new ArrayList<>(animalSounds.keySet());
    }

    /**
     * Presses the button associated with a specific animal in the English state,
     * producing the corresponding animal sound.
     *
     * @param animal The name of the animal whose button is pressed.
     */
    @Override
    public void pressAnimalButton(String animal) {
        System.out.println(animalSounds.get(animal));
    }

    /**
     * Displays a message indicating that the application is already in the English state.
     */
    @Override
    public void pressEnglishButton() {
        // Already in English state
        System.out.println("Already in English state");
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
     * Switches the BabyBook application to the French state.
     */
    @Override
    public void pressFrenchButton() {
        // Switch to French state
        book.setState(book.getFrenchState());
    }
}
