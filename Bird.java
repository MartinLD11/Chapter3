package Flight;

//create Bird class and implementing Flight
public class Bird implements Flight, Movement{

    //create parameters for Bird
    private String type;

    //add constructor and getters and setters
    public Bird(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    //create two Overrides for the fly() method and the toString method
    @Override
    public void fly(){
        System.out.println("I'm a bird who flaps wings to fly.");
    }
    @Override
    public String toString(){
        return "Bird [Type= "+type+ "]";
    }
    //rest of Overrides includes part two of assignment by adding fly2, walk, and jump methods
    @Override
    public void fly2(){
        System.out.println("I flap my wings to fly.");
    }

    @Override
    public void walk(){
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump(){
        System.out.println("I jump by leaping from my feet.");
    }
}
