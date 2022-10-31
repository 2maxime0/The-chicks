import java.util.concurrent.atomic.AtomicInteger;

public class Character {

    protected int id; //Character id
    protected String name;

    //Constructor
    public Character(String name) {
        this.name = name;
    }

    //Speaking functions
    public void present() {
        Chat.speak(getName(), "Hi ! I'm " + getName() + " !");
    }

    //Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    //Getters
    public int getId() { return id; }
    public String getName() { return name; }

}
