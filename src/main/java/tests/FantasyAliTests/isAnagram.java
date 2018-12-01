package tests.FantasyAliTests;

public class isAnagram {

    public static boolean checkIfGivenWordsAnagram(String one, String two){
        char [] oneToArray = one.toLowerCase().toCharArray();
        StringBuilder sbTwo = new StringBuilder(two);
        for(char ch:oneToArray){
            int index = sbTwo.indexOf(Character.toString(ch));
            if(index!=-1){
                sbTwo.deleteCharAt(index);
            }

        }
        return sbTwo.length()==0?true:false;
    }
    public static void main (String [] args){
        System.out.println(checkIfGivenWordsAnagram("army", "mary:"));
    }
}
