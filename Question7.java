/*
 1. display digits.
 2. count digit of a number.
 3. finding a number is armstrong or not.
 // Armstrong number = 153=1^3+5^3+3^3 means if the sum of cube of each digit is equal to the number then it is armstrong number.
 4. reverse a number.
 5. check a number is Palindrome.

 */



import java.util.*;
public class Question7 {
    public static void main(String[]args)
    {  // 1) Solution----------------------------------------------->
        @SuppressWarnings("resource")
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=Sc.nextInt();


        int r;

        while(n>0)
        {
            r=n%10;
            n=n/10;

            System.out.println(r);
        }
        System.out.println(n);
        // 2459
        // 9
        // 5
        // 4
        // 2
        // 0------- n will put 0 in the end because of while loop condition.

        // 2) Solution----------------------------------------------->
        @SuppressWarnings("resource")
        Scanner scanner2=new Scanner(System.in);

        System.out.println("Enter a number");
        int t=Sc.nextInt();

        int count=0;
        while(t>0)
        {
            t=t/10;
            count++;
        }
        System.out.println("Count of digits: "+count);
        // the OT will be ------->
        /*
           Enter a number
           12365478
           Count of digits: 8
         */

        // 3) Solution----------------------------------------------->
        @SuppressWarnings("resource")
        Scanner scanner3=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=Sc.nextInt();

        int original=num;
        int sum=0;

        while(num>0)
        {
            int digit=num%10;
            sum+=digit*digit*digit;
            num=num/10;
        }
        if(sum==original)
            System.out.println(original+" is an Armstrong number.");
        else
            System.out.println(original+" is not an Armstrong number.");
        // the OT will be ------->
        /*
           Enter a number
           153
           153 is an Armstrong number.
           
           Enter a number
           151
           151 is not an Armstrong number.
         */

        // 4) Solution----------------------------------------------->
        @SuppressWarnings("resource")
        Scanner scanner4=new Scanner(System.in);

        System.out.println("Enter a number");
        int reverseNum=Sc.nextInt();

        int rev=0;
        while(reverseNum>0)
        {
            int digit=reverseNum%10;
            rev=rev*10+digit;
            reverseNum=reverseNum/10;
        }
        System.out.println("Reversed number: "+rev);
        // the OT will be ------->
        /*
           Enter a number
           12345
           Reversed number: 54321

           Enter a number
           97568
           Reversed number: 86579
         */

        // 5) Solution----------------------------------------------->
        @SuppressWarnings("resource")
        Scanner scanner5=new Scanner(System.in);

        System.out.println("Enter a number");
        int palindromeNum=Sc.nextInt();

        int originalNum=palindromeNum;
        int reversedNum=0;

        while(palindromeNum>0)
        {
            int digit=palindromeNum%10;
            reversedNum=reversedNum*10+digit;
            palindromeNum=palindromeNum/10;
        }
        if(originalNum==reversedNum)
            System.out.println(originalNum+" is a Palindrome.");
        else
            System.out.println(originalNum+" is not a Palindrome.");
    }
    
}
