public class printing3 {
    public static void main(String [] args)
    {
        int x=10;
        float y=0.0012f;
        char c='A';
        String str="Java Program";
        
        System.out.printf("%3$s %2$f %1d",x,y,str); //its O/T is ---- Java Program 0.001200 10
      //System.out.printf("%1$d %2$f %1d",x,y);  its o/t will be ---- 10 0.001200 10
    }
    
}
