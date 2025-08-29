import java.util.Scanner;

public class readkeybord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x, y;
            System.out.println("Enter 2 Number");
            x = sc.nextInt();
            y = sc.nextInt();

            int z = x + y;
            System.out.println("Sum is " + z);
        }
    }
}
