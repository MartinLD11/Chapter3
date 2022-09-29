/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: Created and abstract superclass for FarmAnimals to include feedLoadingSchedule for each subclass of animals.
 * Each subclass contains parameters from the superclass: name, gender, weight, and age, with each subclass containing
 * the parameter for the sound the specific animal makes. Each subclass contains an override for the toString method to
 * include the sound and an override for the feedLoadingSchedule(). In the MyFarm class, an array list was made to add each name, gender
 * weight, age, and sound to a specific animal and 2 for loops were added to be able to print out the Array list and each feeding schedule for
 * each animal
 * Grade:
 */

package FarmAnimal;

public class MyFarm {
    public static void main(String[] args) {
        //Array list for MyFarm for 2 ducks, 1 cow and 3 chickens
        FarmAnimal[] animal = new FarmAnimal[6];
        animal[0] = new Duck("Donald", "male", 3.2, 5, "Quack Quack");
        animal[1] = new Duck("Cheese", "female", 3.6, 5, "Quack Quack");
        animal[2] = new Cow("Molly", "female", 1600.0, 3, "Moo Moo");
        animal[3] = new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo");
        animal[4] = new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck");
        animal[5] = new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck");

        //Created a for loop to print out Array list and a for loop to print each feeding schedule
        for(FarmAnimal animals : animal){
            System.out.println(animals.toString());
        }
        for(FarmAnimal animals : animal){
            System.out.println(animals.feedLoadingSchedule());
        }
    }
}
