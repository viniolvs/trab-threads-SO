package src;

import java.util.Random;

//gera dados aleatórios para teste
public class GenerateData {
    private static final Random random = new Random();

    //Car data
    public static int getYear() {
        int year = random.nextInt((2022-2000)+1)+2000;
        return year;
    }
    public static String getPlate() {
        String plate = "0000000";
        for (int i = 0; i < plate.length(); i++) {
            plate.replaceFirst("0", Integer.toString(random.nextInt(9))); 
        }
        return plate;
    }
    public static String getModel(int ID) {
        return "model "+ Integer.toString(ID);
    }
    public static String getColor(int ID) {
        if (ID%2 == 0) 
            return "White";
        else
            return "Black";
    }
    public static int getSeats() {
        return random.nextInt(3);
    }

    //User data
    public static String getName(int ID) {
        return "client "+ Integer.toString(ID);
    }
    public static String getCPF() {
        String CPF = "000.000.000-00";
        for (int i = 0; i < CPF.length(); i++) {
            CPF.replaceFirst("0", Integer.toString(random.nextInt(9))); 
        }
        return CPF;
    }

    //Driver data
    public static String getDriverLicense() {
        String cnh = "00000000000";
        for (int i = 0; i < cnh.length(); i++) {
            cnh.replaceFirst("0", Integer.toString(random.nextInt(9))); 
        }
        return cnh;
    }

    public static String getBankAccount() {
        String account = "00000-0";
        for (int i = 0; i < account.length(); i++) {
            account.replaceFirst("0", Integer.toString(random.nextInt(9))); 
        }
        return account;
    }

    //Passenger data
    public static double getBalance() {
        double aux = random.nextInt((100-10)+1)+10;;
        return aux;
    }
}
