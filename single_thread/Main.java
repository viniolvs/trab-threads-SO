package single_thread;

public class Main {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        Client client = new Client();
        int accountID=0;
        while(accountID++ < 3){
            int balance = MoneyCounter.countMoney(GenerateNotes.generateNotes());
            client.setBalance(balance);
            client.setAccountID(accountID);

            WriteFile writeFile = new WriteFile();
            writeFile.doItAll(client.getAccountID(), client.getBalance());
    
        }

        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
