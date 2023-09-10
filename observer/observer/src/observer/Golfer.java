package observer.src.observer;

import java.util.ArrayList;

class Golfer implements Subject {
    private ArrayList<Observer> observers; // List of observers to be notified.
    private String name; // The name of the golfer.

    /**
     * Constructs a new Golfer object with the specified name.
     *
     * @param name The name of the golfer.
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    /**
     * Gets the name of the golfer.
     *
     * @return The name of the golfer.
     */
    public String getName() {
        return name;
    }

    /**
     * Enters the golfer's score for a game and notifies the registered observers.
     *
     * @param strokes The number of strokes the golfer took in the game.
     * @param par     The par value for the game (expected number of strokes).
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }

    /**
     * Registers an observer to receive notifications when the golfer enters a score.
     *
     * @param observer The observer to be registered.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of registered observers.
     *
     * @param observer The observer to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers with the provided stroke and par values.
     *
     * @param strokes The number of strokes the golfer took in the game.
     * @param par     The par value for the game (expected number of strokes).
     */
    @Override
    public void notifyObservers(int strokes, int par) {
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }
}
