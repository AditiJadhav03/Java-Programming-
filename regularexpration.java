public class regularexpration {
    public static void main(String[] args)
    {
     String str1="f";
     // String str1="8";
     // String str1="abc";
     System.out.println(str1.matches("."));

     String str2="abc";
     //String str2="a7";
     String str3="A";
     //  String str3="C"; ITS O/T WILL BE FALSE 
     System.out.println(str3.matches("A|B"));

     System.out.println(str2.matches("[abc]"));
     System.out.println(str2.matches("[a-z][A-Z][0-9]"));

     String str4="a";
     System.out.println(str4.matches("\\w"));
     System.out.println(str4.matches("\\W"));

     String str5="a";
     System.out.println(str5.matches("\\d"));
      System.out.println(str5.matches("\\D"));

     String str6="a";
     System.out.println(str6.matches("\\S"));
      System.out.println(str6.matches("\\s"));

    }
    
}
