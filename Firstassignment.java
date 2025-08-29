import java.util.Scanner;

public class Firstassignment {
    public static void main(String args[])
    {String name;
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("May I know your name");
         name=sc.nextLine();
    }

     System.out.print("welcome "+name);

    
    }
    
}
