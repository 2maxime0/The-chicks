import java.util.concurrent.atomic.AtomicInteger;

public class Human extends Character {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id; //Human number
    private int relationship = -1; //Relationship with another human

    //Constructor
    public Human(String name) {
        super(name);
        this.id = count.incrementAndGet();
    }

    //Speaking functions
    @Override
    public void present() {
        String sentence = "Hello ! I'm " + getName() + " ";
        if(getRelationship() != -1) {
            //TODO: Add a way to find another human with id
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
    public int getId() { return id; }
    public int getRelationship() { return relationship; }

}
