/*
 Q)
 a> Display name of a day based on number
 b>Find type of website and the protocol used 


***********Lect 63**********

 */
import java.util.*;
public class Question5 {
    public static void main(    String[]args){
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter a day number");
        int day=Sc.nextInt();

        if(day==1)
        {
            System.out.println("Mon");
        }
        else if(day==2)
        {
            System.out.println("Tue");
        }
         else if(day==3)
        {
            System.out.println("Wed");
        }
         else if(day==4)
        {
            System.out.println("Thu");
        }
         else if(day==5)
        {
            System.out.println("Fri");
        }
         else if(day==6)
        {
            System.out.println("Sat");
        }
         else if(day==7)
        {
            System.out.println("Sun");
        }
        else{
            System.out.print("Invalid day number");
        }

        /*   output for the program are as follow ----------------------------->
        ot 1>
           Enter a day number
           3
           Wed
        Ot 2>
           Enter a day number
           7
           Sun
        OT 3>
           Enter a day number
           11
           Invalid day number
           
           */

    }
    
}
