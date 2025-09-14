/* Q2) 
a> Find if a number is Binary or not
b> Find if number is Hexa-Decimal or not
c> Find is the data in data format (dd/mm/yyyy)
  
*/


public class Question3 {
    public static void main(String[] args)
    { 

        int b=1000110;
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+1"));
    
    
        String str2="B234A";
        System.out.println(str2.matches("[0-9A-F]+")); //for b


        String date1 = "10/09/2025";  // valid
        String date2 = "32/15/2025";  // invalid but matches structure
        String date3 = "2025/09/10";  // invalid format
        String date4 = "5/9/2025";    // invalid, should be dd/MM/yyyy

        // Regex for dd/MM/yyyy (basic structure, not full calendar validation)
        String regex = "\\d{2}/\\d{2}/\\d{4}";

        System.out.println(date1 + " -> " + date1.matches(regex));
        System.out.println(date2 + " -> " + date2.matches(regex));
        System.out.println(date3 + " -> " + date3.matches(regex));
        System.out.println(date4 + " -> " + date4.matches(regex));


 

    }


    
}

// the ot for Q --------------------->
/*

false
true
10/09/2025 -> true
32/15/2025 -> true
2025/09/10 -> false
5/9/2025 -> false


 */
