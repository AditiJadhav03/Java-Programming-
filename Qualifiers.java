public class Qualifiers {
    public static void main(String [] args)
    {
        String str1="abcdef";
        //String str1="aBcdef"
        String str2="accbaaab";
        //for email ID 
        String str3="johan@gmail.com";
        System.out.println(str3.matches(".*gmail.*"));
        System.out.println(str3.matches("\\w*gmail(.*)"));
        
    
        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str2.matches("[abc]{3,7}"));
    }
    
}
