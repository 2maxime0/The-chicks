public class main {

    //main function
    public static void main(String[] args) {
        Chick[] chicks = new Chick[4];
        chicks[0] = new Chick(null, null, 0);
        chicks[1] = new Chick(null, null, 2);
        chicks[2] = new Chick("Michel", null, 4);
        chicks[3] = new Chick(null, "Lawyer", 3);

        for(Chick chick : chicks) {
            System.out.println(chick.toString());
        }
    }


}
