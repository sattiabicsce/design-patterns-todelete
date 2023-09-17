package observer;

class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        display();
    }

    public String toString() {
        return "Hole Score: Strokes = " + strokes + ", Par = " + par;
    }

    private void display() {
        System.out.println(toString());
    }
}
