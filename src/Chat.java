import java.text.SimpleDateFormat;
import java.util.Date;

public class Chat {

    public static void speak(String name, String sentence) {
        System.out.println("[" + getCurrentTime() + "] " + name + " : " + sentence);
    }

    private static String getCurrentTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

}
