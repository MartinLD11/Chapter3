package Flight;

//class Airplane includes Flight as an implement
public class Airplane implements Flight, Movement{
    //parameters for Airplane class
    private String model;
    private int year;

    //constructors with getters and setters
    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //create toString for to include Airplane parameters
    public String toString(){
        return "Airplane [Model= "+model + ", Year= "+ year+"]";
    }

    //Override the fly method to include airplane statement
    @Override
    public void fly(){
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    //rest of Overrides includes part two of assignment by adding fly2, walk, and jump methods

    @Override
    public void fly2(){
        System.out.println("I rely on my engine to fly.");
    }

    @Override
    public void walk(){
        System.out.println("I tax on my wheels.");
    }

    @Override
    public void jump(){
        System.out.println("I cannot jump");
    }
}
