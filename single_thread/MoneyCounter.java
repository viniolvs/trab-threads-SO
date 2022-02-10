package single_thread;

public class MoneyCounter {
    private static int note_2=0;
    private static int note_5=0;
    private static int note_10=0;
    private static int note_20=0;
    private static int note_50=0;
    private static int note_100=0;
    private static int note_200=0;

    public static int getNoteCount(int note_value) {
        int aux=-1;
        switch (note_value) {
            case 2: 
                aux = note_2;
                break;
            case 5:
              aux = note_5;
                break;
            case 10:
               aux = note_10;
                break;
            case 20:
               aux = note_20;
                break;
            case 50:
               aux = note_50;
                break;
            case 100:
                aux = note_100;
                break;
            case 200:
                aux = note_200;
                break;
            default:
                break;
        }
        return aux;
    }

    public static int countMoney(MoneyNote[] notes ) {
        int total=0;
        for (MoneyNote moneyNote : notes) {
            total+=moneyNote.getValue();
        }
        return total;
    }

    public static void countNotes(MoneyNote[] notes) {
        for (MoneyNote moneyNote : notes) {
            switch (moneyNote.getValue()) {
                case 2: 
                    note_2++;
                    break;
                case 5:
                    note_5++;
                    break;
                case 10:
                    note_10++;
                    break;
                case 20:
                    note_20++;
                    break;
                case 50:
                    note_50++;
                    break;
                case 100:
                    note_100++;
                    break;
                case 200:
                    note_200++;
                    break;
                default:
                    break;
            }
        }
    }
}
