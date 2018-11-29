package tests.formatTests;

public class findFirstNonRepeatedCharacter {
   public static String isFoundFirstRepeatingChar (String str){
       String result = " ";
       int count = 0;
       char [] strToArr = str.toLowerCase().toCharArray();
       for(char chr:strToArr) {
           for (int i = 1; i < str.length(); i++) {
               if (chr != str.charAt(i)) {
                   count = count + 1;
               }
           }
           if (count == 0) {
               result = "first unique character is " + Character.toString(chr);
           }
       }
       return result;
   }

   public static void main (String [] args){
       System.out.println(isFoundFirstRepeatingChar("Alabama"));
   }
}
