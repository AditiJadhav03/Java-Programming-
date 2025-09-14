/*
 1. Display AP.Series.
 //AP is like 2,4,6,8,10,12... Arithmetic Progression
 2.Display GP.Series.
 //GP is like 2,4,8,16,32... Geometric Progression
 3.Display fibonacci series.
 */
import java.util.*;
public class Question9 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc=new Scanner(System.in);

        System.out.print("Program to print AP series");
        System.out.println("Entyer a, d and n");
        int a=Sc.nextInt();
        int d=Sc.nextInt();
        int n=Sc.nextInt();

        int term=a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term += d;// term=term+d;
        }
        System.out.println();
// the ot will be like this =
        /*Program to print AP series
        Enter a, d and n
         3
         5
         10
         3 8 13 18 23 28 33 38 43 48 */

        // 2) GP Series---------------------------------------------->

        System.out.print("Program to print GP series");
        System.out.println("Entyer a, r and n");
         a=Sc.nextInt();
         int r=Sc.nextInt();
         n=Sc.nextInt();

         term=a;
         for (int i = 0; i < n; i++) {
             System.out.print(term + " ");
             term *= r;// term=term*r;
         }
         System.out.println();
         // the ot will be like this =
         /*Program to print GP series Entyer a, r and n
           5
           2
           10
           5 10 20 40 80 160 320 640 1280 2560  */

          // 3) Fibonacci Series---------------------------------------------->

          System.out.print("Program to print Fibonacci series");
          System.out.println("Entyer n");
          n=Sc.nextInt();

          int t1=0,t2=1;

          System.out.print(t1+" ,"+t2+" ,");

          for(int i=2;i<n;i++)
          {
            int t3=t1+t2;
            System.out.print(t3+",");
            t1=t2;
            t2=t3;
          }

          System.out.println();


          // the ot will be like this =
          /*Program to print Fibonacci seriesEntyer n
           10
           0 1 1 2 3 5 8 13 21 34 */

    }
} 
