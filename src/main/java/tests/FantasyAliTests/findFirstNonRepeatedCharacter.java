package tests.FantasyAliTests;

import java.util.LinkedHashMap;
import java.util.Map;

public class findFirstNonRepeatedCharacter {
   public static String isFoundFirstRepeatingChar (String str){
       Map<String, Integer> map = new LinkedHashMap<String, Integer>(str.length());
        String result=" ";
       for(char chr:str.toLowerCase().toCharArray()) {
           map.put(Character.toString(chr), map.containsKey(Character.toString(chr))?map.get(Character.toString(chr))+1:1);
       }
       for(Map.Entry<String, Integer> e:map.entrySet()){
           if(e.getValue()==1){
               return e.getKey();
           }
       }
       throw new RuntimeException("did not find");
   }

   public static void main (String [] args){
       System.out.println(isFoundFirstRepeatingChar("Alabama"));
   }
}
