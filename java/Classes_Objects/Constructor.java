package Classes_Objects;

public class Constructor {
 //Class Member Variables & Fields
 String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;
 
    //Default values set in Constructor
    public Constructor(){
     sModel = "Camry";
     iMake = 2014;
     bLeftHandDrive = true;
    }
 
    public void DisplayCharacterstics(){
     System.out.println("Model of the Car: " +  sModel);
     System.out.println("Number of gears in the Car: " +  iGear);
     System.out.println("Max speed of the Car: " +  iHighestSpeed);
     System.out.println("Color of the Car: " +  sColor);
     System.out.println("Make of the Car: " +  iMake);
     System.out.println("Transmission of the Car: " +  sTransmission);
 
    }
 
}