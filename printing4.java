/* flag  formatter
1) '-' 
2) '+'
3) '0'
4) ' '
5) '('

*/





public class printing4 {
    public static void main(String [] args) {
        int a=10;
        int b=10;
        int c=10;
        int k=10;
        int r=10;



        System.out.printf("%d", a);
        System.out.printf("%5d", b);//%5d 5 here is width place no.
        System.out.printf("%05d", c);//%05d 0 here is it give no 0 for empty places
        System.out.printf("%(5d", k);//%(5d the ( here will give () to the no 
        System.out.printf("%+5d", r);//%+5d + here will show the no.is - or + like +10 as 10 and -10 as -10 */
     

        
    }
    
}
   /*  System.out.printf("%5d", b);//%5d 5 here is width place no.
        System.out.printf("%05d", c);//%0d 0 here is it give no 0 for empty places 
        System.out.printf("%(5d", k);//%(5d the ( here will give () to the no 
        System.out.printf("%+5d", r);//%+5d + here will show the no.is - or + like +10 as 10 and -10 as -10 */