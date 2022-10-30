public class Character {

    private String name;

    //Constructor
    public Character(String name) {
        this.name = name;
    }

    //Speaking functions
    public void present() {
        Chat.speak(getName(), "Hi ! I'm " + getName() + " !");
    }

    //Setters
    public void setName(String name) { this.name = name; }

    //Getters
    public String getName() { return name; }

}
