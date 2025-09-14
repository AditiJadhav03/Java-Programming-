/*
 System.out.printf() 
 System.out.format()
*/






public class printing2 {
    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        //if we change . o/t will also change for %e in float it will change from 1.256000e+01 to 1.256000e+02 if float y=125.6f 
        char c='A';
        String str="Java Program"; 


     
    System.out.printf("Hello\n");
    System.out.printf("Hello %d %f %c World\n", x, y, c ); //int d,o,x use for int bout it will give different output is like this
    System.out.format("Hello %o %f %c World\n", x, y, c ); //int o 
    System.out.format("Hello %x %f %c World\n", x, y, c ); //int x
    System.out.format("Hello %o %e %c World\n", x, y, c ); /* float also use f,e,g we will look for the output difference
        here float e */
    System.out.format("Hello %o %g %c World\n", x, y, c );//float g
    System.out.printf("Hello %s \n", str);
    }
    
}
