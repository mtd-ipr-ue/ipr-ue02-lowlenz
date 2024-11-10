import libraries.In;
import libraries.Out;


public class ue02_3 {
    public static void main(String[] args) {

        int radius = 4;
                
        Out.println("Please enter a positiv x-Cordinate: ");
        double xachse = In.readInt();

        Out.println("Please enter a positiv y-Cordinate: ");
        double yachse = In.readInt();

        double abstand = Math.sqrt((xachse*xachse)+(yachse*yachse));
        
        boolean greenarealimit = (xachse <= 4 && yachse <= 4);

        Out.println(abstand);
        

        if (abstand >= radius && greenarealimit) //Fehler
        {
            Out.println("The point is in the greenarea");
        }
        else
        {
            Out.println("The point is outside the greenarea");
        }

        
    }
}
