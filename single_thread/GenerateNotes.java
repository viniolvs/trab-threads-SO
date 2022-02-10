package single_thread;

import java.util.Random;

//Gera quantias de notas aleatórias
public class GenerateNotes {
    private static final Random randomNote = new Random();
    private static final Random randomSize = new Random();
    private MoneyNote[] notes;

    //construtor gera vetor de 1000 notas aleatórias 
    GenerateNotes(){
        this.notes = generateNotes();
    }

    public MoneyNote[] getNotes() {
        return notes;
    }

    //Gera uma nota de valor aleatório
    public static MoneyNote generateMoneyNote() {
        int value=-1;
        int aux = randomNote.nextInt(7);
        switch (aux) {
            case 0: 
                value = 2;
                break;
            case 1:
                value = 5;
                break;
            case 2:
                value = 10;
                break;
            case 3:
                value = 20;
                break;
            case 4:
                value = 50;
                break;
            case 5:
                value = 100;
                break;
            case 6:
                value = 200;
                break;
            default:
                break;
        }
        MoneyNote generatedNote = new MoneyNote(value);
        return generatedNote;
    }

    //gera um vetor de 1000 notas aleatórias
    public static MoneyNote[] generateNotes() {
        //gera um int aleatorio entre 10 e 20
        int size = randomSize.nextInt(20) + 10;
        MoneyNote[] notes = new MoneyNote[size];
        for (int i = 0; i < size; i++) {
            notes[i] = generateMoneyNote();
        }
        return notes;   
    }
}
