package decorator;

import java.util.ArrayList;

//Vehicle class representing a base vehicle
class Vehicle {
 protected ArrayList<String> lines;

 public Vehicle(ArrayList<String> lines) {
     this.lines = lines;
 }

 @Override
 public String toString() {
     StringBuilder carString = new StringBuilder();
     for (String line : lines) {
         carString.append(line).append("\n");
     }
     return carString.toString();
 }
}
