/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: The assignment was to create three interface methods and call them to the new main method
 * ThingsThatMove. Same parameters for the ThingsThatFly assignment, but for this particular assessment, we
 * needed to include three methods about the Airplane and two Birds. The fly2() method was added to give
 * the proper output for the assignment.
 * Grade:
 */

package Flight;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {

        //Create an object for Airplane and two for Bird classes
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird bird1 = new Bird("Eagle");
        Bird bird2 = new Bird("Hummingbird");

        //store 3 objects into Movement Array
        Movement[] movements = {airplane, bird1, bird2};

        //create for loop to print out objects and including interface methods
        for(Movement m : movements){
            System.out.println(m + ": ");
            m.fly2();
            m.jump();
            m.walk();
        }
    }
}
