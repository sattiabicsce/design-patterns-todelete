package state;

import java.util.ArrayList;

/**
 * Represents the Spanish state in the BabyBook application.
 */
class SpanishState extends State {

    /**
     * Constructor for the SpanishState class.
     *
     * @param book The BabyBook instance associated with this state.
     */
    public SpanishState(BabyBook book) {
        super(book);
        // Initialize Spanish animal sounds
        animalSounds.put("Pájaro", "pío");
        animalSounds.put("Gato", "miau");
        animalSounds.put("Gallina", "coc co co coc");
        animalSounds.put("Perro", "Guau");
        animalSounds.put("Caballo", "relinchar");
        animalSounds.put("Ratón", "cui-cui");
        animalSounds.put("Oveja", "bee, mee");
    }

    /**
     * Gets the list of animals in the Spanish language.
     *
     * @return An ArrayList containing the names of animals in Spanish.
     */
    @Override
    public ArrayList<String> getAnimalList() {
        return new ArrayList<>(animalSounds.keySet());
    }

    /**
     * Presses the button associated with a specific animal in the Spanish state,
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
     * Displays a message indicating that the application is already in the Spanish state.
     */
    @Override
    public void pressSpanishButton() {
        // Already in Spanish state
        System.out.println("Already in Spanish state");
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
