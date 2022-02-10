package single_thread;


public class Test {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        GenerateNotes g = new GenerateNotes();
        
        MoneyNote[] notes = g.getNotes();

        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i].getValue() + " ");
        }
        System.out.println();
        
        int total = MoneyCounter.countMoney(notes);
        MoneyCounter.countNotes(notes);
        int note_value=100;
        int note = MoneyCounter.getNoteCount(note_value);
        System.out.println("Total: "+total+ "\nNotas de " +note_value+ " = "+note);

        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
