public class Literal {
    public static void main(String arg[])
    {
         byte b1=10;
         byte b2=0b1010;
         byte b3=012;
         byte b4=0XA;

         long l=125;
         long l1=9999999999999L;
        /*for long no in java we cant separate them by "," but can do it by using "_" Ex. we have 
        number a=99999999 so it will be writen as 9_99_99_99_999 like this */



         float f=12.56f;
         double d=12.56;


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(f);
        System.out.println(d);
    }
    
}
