package FarmAnimal;

public class Duck extends FarmAnimal{
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound){
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    //Continue the Override for the toString to add sound
    //Create Override for feedLoadingSchedule() to add feeding times
    @Override
    public String toString(){
        return "Duck "+ getSound()+ super.toString();
    }
    @Override
    public String feedLoadingSchedule(){
        return getName()+ ": 8am-12pm-6pm";
    }
}
