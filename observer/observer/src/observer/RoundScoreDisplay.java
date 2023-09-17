package observer;

class RoundScoreDisplay implements Observer {
 private Subject golfer;
 private int strokesTotal;
 private int parTotal;

 public RoundScoreDisplay(Subject golfer) {
     this.golfer = golfer;
     golfer.registerObserver(this);
 }

 public void update(int strokes, int par) {
     strokesTotal += strokes;
     parTotal += par;
     display();
 }

 public String toString() {
     return "Round Score: Strokes Total = " + strokesTotal + ", Par Total = " + parTotal;
 }

 private void display() {
     System.out.println(toString());
 }
}
