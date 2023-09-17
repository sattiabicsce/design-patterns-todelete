package decorator;

//Car class representing a basic car
class Car extends Vehicle {
 public Car() {
     super(FileReader.getLines("decorator/txt/car.txt"));
 }
}
