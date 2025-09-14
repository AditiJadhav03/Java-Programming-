/*
here we will see different " PRINT " methods 
1) System.out.print()
2) System.out.println()
3) System.out.printf()
4) System.out.format()

*/ 
public class Printing {
    public static void main(String[] args) {
        // 1) System.out.print() 
        System.out.print("Hello ");
        System.out.print("World");
        System.out.print("\n"); // to move to next line

        // 2) System.out.println() 
        System.out.println("Hello World"); // prints and moves to next line
        System.out.println("Welcome to Java Programming");

        // 3) System.out.printf() 
        int a = 10;
        float b = 5.5f;
        String name = "Java";
        System.out.printf("Integer: %d, Float: %.2f, String: %s\n", a, b, name);

        // 4) System.out.format() 
        double price = 49.99;
        int quantity = 5;
        System.out.format("Price: $%.2f, Quantity: %d\n", price, quantity);
        // Both printf and format are similar and can be used interchangeably
            int x=10,y=20;

            int l=10;
            float h=12.55f;
            char c='A';
            String str="Hello";

            System.out.println("Value of c: " + c);
            System.out.println(str);
            System.out.println("Value of l: " + l);
            System.out.println("Value of h: " + h);
            System.out.println(x+y);
            System.out.println(x+y+"Sum");


            /* we want output like this 
             "Sum of " 10 and 20 is 30   then we will do it like this 
             "Sum of "+10+"and"+y+"is"+(x+y)-----that "is" this was for space 
             lets write code for it 
            */
            int s=10,k=20;
            System.out.println("Sum of "+s+" and "+k+" is "+(s+k));

        }

    }