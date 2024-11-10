import libraries.In;
import libraries.Out;


public class ue02_3 {
    public static void main(String[] args) {

        int radius = 4;
                
        Out.println("Please enter a positiv x-Cordinate: ");
        double xachse = In.readInt();

        Out.println("Please enter a positiv y-Cordinate: ");
        double yachse = In.readInt();

        double abstand = Math.sqrt((xachse*xachse)+(yachse*yachse)); //Abstand zu 0 Punkt
        
        boolean greenarealimit = (xachse <= 4 && yachse <= 4);
        boolean positivarea = (xachse>= 0 && yachse >= 0);

        Out.println(abstand);
        

        if (abstand >= radius && greenarealimit && positivarea) 
        {
            Out.println("The point is in the greenarea");
        }
        else
        {
            Out.println("The point is outside the greenarea");
        }

        
    }
}
