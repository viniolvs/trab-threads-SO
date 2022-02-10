package single_thread;

import java.util.Random;

public class GenerateNotes {
    private static final Random randomNote = new Random();
    private static final int size=1000;
    private MoneyNote[] notes;

    GenerateNotes(){
        this.notes = generateNotes();
    }

    public MoneyNote[] getNotes() {
        return notes;
    }

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

    public static MoneyNote[] generateNotes() {
        MoneyNote[] notes = new MoneyNote[size];
        for (int i = 0; i < size; i++) {
            notes[i] = generateMoneyNote();
        }
        return notes;   
    }
}
