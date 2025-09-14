/*
 Display the no in words even with tailing 0.
n=123 One Two Three
n=1200 One Two Zero Zero
Like this 

 */


import java.util.*;
public class Question8 {
    public static void main(String[]args)
    {
        @SuppressWarnings("resource")
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=scanner.nextInt();

        int r;
        String str="";

        while(num>0)
        {
            r=num%10;
            num=num/10;
            str=str+r;

        }
        System.out.println(str);

        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            switch(ch)
            {
                case '0':
                System.out.println("Zero");
                break;

                case '1':
                System.out.println("One");
                break;

                case '2':
                System.out.println("Two");
                break;

                case '3':
                System.out.println("Three");
                break;

                case '4':
                System.out.println("Four");
                break;

                case '5':
                System.out.println("Five");
                break;

                case '6':
                System.out.println("Six");
                break;

                case '7':
                System.out.println("Seven");
                break;

                case '8':
                System.out.println("Eight");
                break;

                case '9':
                System.out.println("Nine");
                break;
            }
        }
        /*
         * import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int r;
        String str = "";

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            str = str + r;  //  only once
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            switch (ch) {
                case '0': System.out.println("Zero"); break;
                case '1': System.out.println("One"); break;
                case '2': System.out.println("Two"); break;
                case '3': System.out.println("Three"); break;
                case '4': System.out.println("Four"); break;
                case '5': System.out.println("Five"); break;
                case '6': System.out.println("Six"); break;
                case '7': System.out.println("Seven"); break;
                case '8': System.out.println("Eight"); break;
                case '9': System.out.println("Nine"); break;
            }
        }
    }
}

         */

    }
    
}
