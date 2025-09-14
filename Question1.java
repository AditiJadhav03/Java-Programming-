/*Q1) 
a> Find if the email id is on gmail
b> Find username and domain name from email

String str =" programming@gmail.com";





*/
public class Question1 {
    public static void main(String[] args)
    {
        String str="programming@gmail.com";

        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1, str.length());



        System.out.println("Username "+uname);
        System.out.println("Domain :"+domain);
        System.out.println(domain.startsWith("gmail"));//if its not gmail them i will get false 
    
    
    
    }
    
}
//ot for the Q-------------------------------------->

/*
  

Username programming
Domain :gmail.com
true


 */