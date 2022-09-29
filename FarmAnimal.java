package FarmAnimal;

public abstract class FarmAnimal {
    //parameters
    private String name;
    private String gender;
    private double weight;
    private int age;

    //constructor
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Override for toString and adding abstract method for feedLoadingSchedule()
    @Override
    public String toString(){
        return "\nName: "+name+", Gender: "+gender+", Weight: "+ weight+", Age: "+age;
    }
    public abstract String feedLoadingSchedule();
}
