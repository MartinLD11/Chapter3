/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: The objective is to create an interface class for fly() method and add that
 * method to both Airplane and Bird classes. Once those are completed with constructors, getters and
 * setters with Overriding the toString and fly classes, the main method was created to implement
 * each parameter for one Airplane and two Birds and create and Array to store each object in order to
 * call the fly interface. Then create a for loop to print each object with the fly method and toString
 * method
 * Grade:
 */


package Flight;

import java.util.*;

public class ThingsThatFly{
    public static void main(String[] args) {

        //Create an object for Airplane and two for Bird classes
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird bird1 = new Bird("Eagle");
        Bird bird2 = new Bird("Hummingbird");

        //store 3 objects into Array
        Flight[] flights = {airplane, bird1, bird2};

        //create for loop to print out objects
        for(Flight f : flights){
            System.out.print(f + ": ");
            f.fly();
        }
    }
}