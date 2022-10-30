public class main {

    //main function
    public static void main(String[] args) {

        //TODO : Add a json file manager to save and load

        //TODO : Add static lists of objects in said Classes

        Chick[] chicks = new Chick[4];
        chicks[0] = new Chick(null, null, 0);
        chicks[1] = new Chick(null, null, 2);
        chicks[2] = new Chick("Michel", null, 4);
        chicks[3] = new Chick(null, "Lawyer", 3);

        for(Chick chick : chicks) {
            chick.present();
        }

        Human[] humans = new Human[2];
        humans[0] = new Human("Maxime");
        humans[1] = new Human("Iris");
        humans[0].setRelationship(humans[1].getId());

        humans[0].present();
    }


}
