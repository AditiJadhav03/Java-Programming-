public class Relational {
    public static void main(String args[])
    {
        int a=5,b=10,c=15;
        float d=5.4f,s=5.5f,l=15;

        System.out.println(a<b);
        System.out.println(a<b && a<c);
        System.out.println(a<b || a>c);
        System.out.println(d>s);
        System.out.println(l>s);
        //if-else example 1

        int n=5;

        if(n>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
        
        //if-else ex.2 

        int p=20;
        if(p>=0)
        {
            System.out.println("Yes");
        }
        else
        {
           System.out.println("NUP");
        }
        
        //multiple if-else Ex.3  (if-else if-else) example -------

        int h=5,m=15,v=4;

        if(h>m && h>v)
        {
            System.out.println(h);
        }
        else if(m>v)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(v);
        }
        
        // else if ladder is nothing but use else if condition multiple time as need 
       
    }
    
}
