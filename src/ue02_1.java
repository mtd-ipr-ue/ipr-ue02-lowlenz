import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        
        Out.println("Please enter the first Number: ");
        int number1 = In.readInt();

        Out.println("Please enter the second Number: ");
        int number2 = In.readInt();

        Out.println("Please enter the third Number: ");
        int number3 = In.readInt();

        if (number1 > number2 && number1 > number3)
        {
            int max = number1;
            Out.println("Die Maximum beträgt "+ max);
        }
        else if (number2 > number1 && number2 > number3)
        {
            int max = number2;            
            Out.println("Die Maximum beträgt "+ max);
        }
        else
        {
            int max = number3;            
            Out.println("Die Maximum beträgt "+ max);
        }
        
        
        
        
    }
}
