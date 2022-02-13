package single_thread;

import java.util.Random;

//Gera quantias de notas aleatórias
public class GenerateBalance {
    private static final Random random = new Random();
    //construtor gera vetor de 1000 notas aleatórias 
    public static int getBalance() {
        return random.nextInt(10000);
    }

    //Gera uma nota de valor aleatório
}
