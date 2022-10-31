import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Human extends Character {

    private static final AtomicInteger count = new AtomicInteger(0);
    public static ArrayList<Human> humans = new ArrayList<>();

    private int relationship = -1; //Relationship with another human

    //Constructor
    public Human(String name) {
        super(name);
        setId(count.incrementAndGet());
    }

    //Speaking functions
    @Override
    public void present() {
        String sentence = "Hello ! I'm " + getName();
        if(getRelationship() != -1) {
            sentence += " and I'm in relationship with " + humans.get(getRelationship()-1).getName() + " !";
        } else {
            sentence += " !";
        }
        Chat.speak(getName(), sentence);
    }

    @Override
    public String toString() {
        return "Id : " + getId() + "\nName : " + getName() +"\nRelationship : " + getRelationship();
    }

    //Setters
    public void setRelationship(int relationship) { this.relationship = relationship; }

    //Getters
    public int getRelationship() { return relationship; }

}
