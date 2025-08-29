import java.util.Scanner;

public class Expression {
    public static void main (String arg[])
    {
        float base,height,area;
        System.out.println("Enter Base and Height");


        try (Scanner sc = new Scanner(System.in)) {
            base=sc.nextFloat();
            height=sc.nextFloat();
        }
        area=0.5f*base*height;
        //area=base*height*height;
        //area=1f/2f*base*height/2;  you can write like this too


        System.out.println("Area is: "+area);

        /*there is another method to get area second one is like this 

    
            Scanner sc = new Scanner(System.in);
            int a,b,c;
            float s,area;

            System.out.println("Enter 3 side of a triangle");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            s=(a+b+c)/2f;

            area2=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }

        System.out.println("Area is: "+area2); */
    }
}
