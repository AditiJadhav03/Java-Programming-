/*        
  a> Find a number is odd or even.
  no / by 2 is odd
  b> Find person is young or not young
  c> Find grades for given marks


 */

import java.util.Scanner;
public class Question4 {
    public static void main(String args[]) 
    {      
        ///a
        ///  a) solution-------------
     int n;

     @SuppressWarnings("resource")
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter a number ");
     n=Sc.nextInt();

     if(n%2==0)
     {
        System.out.println("It is even number ");
     }
     else
     {
      System.out.println("It is odd number");
     }
    

     //  b> solution------------------------

     int h;
     System.out.println("Enter the age ");
     h=Sc.nextInt();

     if(h>=18)
     {
        System.out.println("The person is not young .");
     }
     else if (h<18)
     {
        System.out.println("The person is too young its child .");
     }
     else
     {
        System.out.println("The person is young .");
     }

    
        
//another way -------------------
        /*
        
        int age;
        Scanner sc.new Scanner(System.in);

        System.out.println("Enter your age: ");
        age=sc.nextInt();
        if(age>=14 && sge<=55)
        {
        System.out.println("You are young");
        }
        else
        {
        System.out.println(You are Not young);
        }


        */

        // c> solution-------------------------------

        int m1,m2,m3;

        System.out.println("Enter marks of 3 subjects ");
        m1=Sc.nextInt();
        m2=Sc.nextInt();
        m3=Sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;

        if(avg >= 70){
            System.out.println("Grade A");
        }
        else if(avg >= 60 && avg < 70)
        {
            System.out.println("Grade B");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("Grade C");
        }
        else if(avg >= 40 && avg < 50)
        {
            System.out.println("Grade D");
        }
        else 
        {
            System.out.println("Grade E");
        }

    }
    
}

/// this are ot for all Q ----------------------------------->
/*
Enter a number 
65
It is odd number
Enter the age 
50
The person is not young .
Enter marks of 3 subjects 
40
58
62
Grade C
*/
