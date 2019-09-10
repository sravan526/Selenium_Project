package Classes_Objects;
public class ConstructorTestExercise {
 
 public static void main(String[] args) {
 //Use the Car keyword to declare Car Class variable
 Car Toyota = new Car();;
 
 Toyota.iDoors = 4;
 Toyota.iGear = 5;
 Toyota.iHighestSpeed = 200;
 Toyota.iTyres = 4;
 Toyota.sColor = "Black";
 Toyota.sTransmission = "Manual";
 
 //Using Car class method
 Toyota.DisplayCharacterstics();
 
 }
 
}