import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Chick extends Character {

    private static final AtomicInteger count = new AtomicInteger(0);
    public static ArrayList<Chick> chicks = new ArrayList<Chick>();

    private String profession;
    private Integer age;

    //TODO : Create a dictionnary of characters references and their affection level

    //Chick constructor
    public Chick(String name, String profession, Integer age) {
        super(name);
        setId(count.incrementAndGet());
        setAge(age);
        setProfession(profession);
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
        Chat.speak(getLongName(), sentence);
    }
    public void askPlayBall() {
        Chat.speak(getLongName(), "Who would like to play the ball with me ?");
        ArrayList<Chick> interestedChicks = new ArrayList<>();
        for(Chick chick : chicks) {
            int interestedChickId = chick.answerPlayBall(getId());
            if(interestedChickId != -1) {
                interestedChicks.add(Chick.chicks.get(interestedChickId-1));
            }
        }
        //TODO : Create an activity class
    }
    private int answerPlayBall(int id) {
        int answer = (int) Math.round((Math.random()*3)+1);
        switch (answer) {
            case 1:
                Chat.speak(getLongName(), "Yes " + Chick.chicks.get(id-1).getLongName() + ", I would love to :D !");
                return getId();
            case 2:
                Chat.speak(getLongName(), "I'm sorry " + Chick.chicks.get(id-1).getLongName() + ", not right now :c.");
            case 3:
        }
        return -1;
    }
    public void expressFeelingsForHuman(int id) {
        Chat.speak(getLongName(), "I really like " + Human.humans.get(id-1).getName() + " ^-^.");
    }
    public void askRandomQuestion() {

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
        if(getAge() < 2) { fullName = "Baby" + " " + fullName; }
        return fullName;
    }

    //Setters
    public void setProfession(String profession) { this.profession = profession; }
    public void setAge(Integer age) { this.age = age; }

    //Getters
    public String getProfession() { return profession; }
    public Integer getAge() { return age; }

}
