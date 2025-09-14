public class Pattern5 {
    public static void main(String[]args){
        int count=0;
        int n=5;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
            //System.out.print(i+j+" ");
            //System.out.print(i+" ");
            //System.out.print(j+" ");
            //System.out.print(++count+" ");
            // for same space in 2digit no. in pattern make change like this 
            System.out.format("%2d ",count++);
        }
        System.out.println("");
      }
/*Logic Explained Simply:

Outer loop (i) → row number (1 to 5).

Inner loop (j) → prints numbers from 1 to i.

So row 1 → print 1
row 2 → print 12
row 3 → print 123 … and so on. */






}
    
}
