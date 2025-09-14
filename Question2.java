/*
Q1)
a> Find radix of a number given in a string
b> Find a given year id a leap year

for a> string name =1010110 ; binary 2
            =12357; octal 8
            =A25B; Hexadecimal 16
            =25978; Decimal 10  
           ( 0-7
            0-F
            0-9A-F
            0-9)
    b> leap year 
    if(year%4==0)
    if(year%100==0)
    if(year%400==0)
 */
import java.util.*;

public class Question2 {
    public static void main(String[] args)
    {
     @SuppressWarnings("resource")
     Scanner scan=new Scanner(System.in);
     @SuppressWarnings("unused")
     String num;

     System.out.println("Enter a Number ");
     num=scan.nextLine();
     if (num.matches("[01]+"))
     {
        System.out.println("Binary Radix=2");
     }
     else if(num.matches("[0-7]+"))
     {
        System.out.println("Octal Radix=8");
     }
     else if(num.matches("[0-9]+"))
     {
        System.out.println("Decimal Radix=10");
     }
     else if(num.matches("[0-9A-F]+"))
     {
        System.out.println("Hexadecimal Radix=16");
     }
     else
     {
        System.out.println(" This is no a number ");
     }



     // b

      Scanner Scan=new Scanner(System.in);

      System.out.println("Enter a Year Number: ");
      int year=Scan.nextInt();

      if(year%4==0)
      {

       if(year%100==0)
       {

        if(year%400==0)

        {
            System.out.println(" It's a Leap Year ");
        }
        else
        {
             System.out.println(" Not a Leap Year");
        }

       }

      }

      else
     {
        System.out.println(" Not a Leap Year ");
     }


    }

  

    
}
/*


1st OT----------------->

Enter a Number 
A25B
Hexadecimal Radix=16
Enter a Year Number: 
2000
It's a Leap Year 
2nt  ot----------------------------->

Enter a Number 
25689354
Decimal Radix=10
Enter a Year Number: 
1700
Not a Leap Year

 */