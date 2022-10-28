public class Chick {

    private String name;
    private String profession;
    private Integer age;

    //Chick constructor
    public Chick(String name, String profession, Integer age) {
        if(name == null) { this.name = "Chick"; } else { this.name = name; }
        this.profession = profession;
        if(age == null || age < 0) { this.age = 0; } else { this.age = age; }
    }

    //whoAmI function overriding toString
    @Override
    public String toString() {
        String sentence = "I am " + getName() + " and I'm " + getAge() + " years old";
        if(getAge() <= 1) { sentence += " :p."; } else { sentence += " :)."; }
        return sentence;
    }

    //Get name with profession
    public String getName() {
        String fullName = name;
        if(getProfession() != null) { fullName = getProfession() + " " + fullName; }
        if(getAge() < 1) { fullName = "Baby" + " " + fullName; }

        return fullName;
    }

    //getProfession
    public String getProfession() {
        return profession;
    }

    //getAge
    public Integer getAge() {
        return age;
    }

}
