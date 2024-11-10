import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

        Out.println("Please enter a year: ");
        int year = In.readInt();

        Out.println("Please enter a month: ");
        int month = In.readInt();

        int days;

        switch (month) {
            case 1:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 2:
                if (year%4 == 0)
                {
                    days = 29;
                }
                else
                {
                    days = 28;
                }
                Out.println("Anzahl der Tage:" + days);
                break;
            case 3:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 4:
                days = 30;
                Out.println("Anzahl der Tage:" + days);
                break; 
            case 5:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 6:
                days = 30;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 7:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 8:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 9:
                days = 30;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 10:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 11:
                days = 30;
                Out.println("Anzahl der Tage:" + days);
                break;
            case 12:
                days = 31;
                Out.println("Anzahl der Tage:" + days);
                break;       
            default:
                break;
        }

        
        
    }
}
