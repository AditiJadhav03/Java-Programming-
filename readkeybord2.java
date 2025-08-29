import java.util.Scanner;

public class readkeybord2 {
    public static void main(String arg[])
    {
        try (Scanner Scanner = new Scanner(System.in)) {
            Scanner.useRadix(2);
            int x=Scanner.nextInt();
            
            System.out.println(x);
        }
    }
    
}
