package decorator;

//Paint class to paint the vehicle in a specified color
class Paint extends VehicleDecorator {
 private String colorCode;

 public Paint(Vehicle vehicle, String color) {
     super(vehicle.lines);
     this.colorCode = getColorCode(color);
     applyColor();
 }

 private String getColorCode(String color) {
     switch (color) {
         case "red":
             return "\u001B[31m";
         case "green":
             return "\u001B[32m";
         case "yellow":
             return "\u001B[33m";
         case "blue":
             return "\u001B[34m";
         case "purple":
             return "\u001B[35m";
         case "cyan":
             return "\u001B[36m";
         default:
             return "\u001B[0m"; // Default to black
     }
 }

 private void applyColor() {
     // Apply the selected color to each line
     for (int i = 0; i < lines.size(); i++) {
         lines.set(i, colorCode + lines.get(i));
     }
 }
}
