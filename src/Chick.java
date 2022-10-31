import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Chick extends Character {

    private static final AtomicInteger count = new AtomicInteger(0);
    public static ArrayList<Chick> chicks = new ArrayList<Chick>();

    private int id; //Chick number
    private String profession;
    private Integer age;

    //TODO : Create a dictionnary of characters references and their affection level

    //Chick constructor
    public Chick(String name, String profession, Integer age) {
        super(name);
        this.id = count.incrementAndGet();
        this.age = age;
        this.profession = profession;
        checkFields();
    }

     private void checkFields() {
        if(getName() == null) { setName("Chick"); }
        if(getAge() == null || getAge() < 0) { setAge(0); }
    }

    //Speaking functions
    @Override
    public void present() {
        String sentence = "Hello ! I'm " + getLongName() + " and I'm " + getAge() + " years old ";
        if(getAge() < 2) { sentence += ":d."; } else { sentence += ":)."; }
        Chat.speak(getName(), sentence);
    }

    //Chick informations
    @Override
    public String toString() {
        String sentence = "Id : " + getId() + "\nName : " + getLongName() + "\nAge : "
                + getAge() + "\nProfession : " + getProfession();
        return sentence;
    }

    //Get name with profession
    public String getLongName() {
        String fullName = getName();
        if(getProfession() != null) { fullName = getProfession() + " " + fullName; }
        if(getAge() < 1) { fullName = "Baby" + " " + fullName; }
        return fullName;
    }

    //Setters
    public void setProfession(String profession) { this.profession = profession; }
    public void setAge(Integer age) { this.age = age; }

    //Getters
    public int getId() { return id; }
    public String getProfession() { return profession; }
    public Integer getAge() { return age; }

}
