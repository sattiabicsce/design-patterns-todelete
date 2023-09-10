package observer.src.observer;

class RoundScoreDisplay implements Observer {
    private Subject golfer;       // The golfer being observed.
    private int strokesTotal;     // The total number of strokes for the round.
    private int parTotal;         // The total par value for the round.

    /**
     * Constructs a new `RoundScoreDisplay` object and registers it as an observer
     * for the specified golfer.
     *
     * @param golfer The golfer to observe for round score updates.
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the round score with the provided stroke and par values and displays
     * the updated score.
     *
     * @param strokes The number of strokes taken by the golfer for the current hole.
     * @param par     The par value for the current hole.
     */
    @Override
    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
        display();
    }

    /**
     * Returns a string representation of the round score.
     *
     * @return A string in the format "Round Score: Strokes Total = X, Par Total = Y".
     */
    @Override
    public String toString() {
        return "Round Score: Strokes Total = " + strokesTotal + ", Par Total = " + parTotal;
    }

    /**
     * Displays the round score by printing it to the console.
     */
    private void display() {
        System.out.println(toString());
    }
}
