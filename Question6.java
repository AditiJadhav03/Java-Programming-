/*
 Q)
 a. Display Multiple Table
 b>Find Sum of n numbers
 c>Factorial of a number


 */








import java.util.*;
public class Question6 {
    public static void main(String[] args)
    
     //a> solution---------------------->
    {
        @SuppressWarnings("resource")
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=Sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }

        // OT for the Q is like this =
/*
Enter a number
7
7X1=7
7X2=14
7X3=21
7X4=28
7X5=35
7X6=42
7X7=49
7X8=56
7X9=63
7X10=70 

         */
// b) Solution------------------------->

    @SuppressWarnings("resource")
    Scanner Scanner=new Scanner(System.in);

        System.out.println("Enter a number");
         int i=Sc.nextInt();

        int sum=0;
        for(int j=1;j<=n;j++)
        {
        sum=sum+j;
        }
        System.out.println("Sum of "+ n + "Number is" +sum );


        // c) Solution----------------------------------------------------->
        //n! factorial like 4!=1*2*3*4

      @SuppressWarnings({ "resource", "unused" })
      Scanner scanner2=new Scanner("Enter the number");
      int m=Sc.nextInt();

      long fact=1;

      for(int k=1;k<=m;k++)
      {
        fact=fact*k;
      }
      System.out.println("Factorial is "+fact);

      


    }

    
}
