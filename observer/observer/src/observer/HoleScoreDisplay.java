package observer.src.observer;

class HoleScoreDisplay implements Observer {
    private Subject golfer; // The golfer being observed.
    private int strokes;   // The number of strokes taken by the golfer.
    private int par;       // The par value for the hole.

    /**
     * Constructs a new `HoleScoreDisplay` object and registers it as an observer
     * for the specified golfer.
     *
     * @param golfer The golfer to observe for hole score updates.
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the hole score with the provided stroke and par values and displays
     * the updated score.
     *
     * @param strokes The number of strokes taken by the golfer for the hole.
     * @param par     The par value for the hole.
     */
    @Override
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        display();
    }

    /**
     * Returns a string representation of the hole score.
     *
     * @return A string in the format "Hole Score: Strokes = X, Par = Y".
     */
    @Override
    public String toString() {
        return "Hole Score: Strokes = " + strokes + ", Par = " + par;
    }

    /**
     * Displays the hole score by printing it to the console.
     */
    private void display() {
        System.out.println(toString());
    }
}
