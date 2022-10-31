public class main {

    //main function
    public static void main(String[] args) {

        //TODO : Add a json file manager to save and load

        Chick.chicks.add(new Chick(null, null, 0));
        Chick.chicks.add(new Chick(null, null, 2));
        Chick.chicks.add(new Chick("Michel", null, 4));
        Chick.chicks.add(new Chick(null, "Lawyer", 3));

        for(Chick chick : Chick.chicks) {
            chick.present();
        }

        Human.humans.add(new Human("Maxime"));
        Human.humans.add(new Human("Iris"));
        Human.humans.get(0).setRelationship(Human.humans.get(1).getId());
        Human.humans.get(1).present();
        Human.humans.get(0).present();

        Chick.chicks.get(3).askPlayBall();

        Chick.chicks.get(0).expressFeelingsForHuman(2);
    }


}
