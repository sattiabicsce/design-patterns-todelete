package decorator;

//Rims class to add rims decoration
class Rims extends VehicleDecorator {
 public Rims(Vehicle vehicle) {
     super(vehicle.lines);
     integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
 }
}
