public class StringPractice {
    public static void main(String[] args)
    {
        String str1="java program";
       // String str2="JAVA"; 

        String str2=new String("JAVA");

        char c[]={'H','B','C','D'};
        String str3=new String(c);

        byte b[]={65,66,67,68,69,70};
        String str4=new String(b);


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
    
}
