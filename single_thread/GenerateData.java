package single_thread;

import java.util.Random;

//gera dados aleatórios para teste
public class GenerateData {
    private static final Random random = new Random();

    //Book data
    public static int getYear() {
        return random.nextInt(2022)+1900;
    }
    public static int getEdition() {
        return random.nextInt(20);
    }
    public static String getTitle(int ID) {
        return "book "+ Integer.toString(ID);
    }
    public static String getAuthor(int ID) {
        return "author "+ Integer.toString(ID);
    }

    //clientdata
    public static String getName(int ID) {
        return "client "+ Integer.toString(ID);
    }
}
