package day19_Loops;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String word = "abcabcbacbacbccccccaaaaaabbbbbbbbaaaaa";
        String result = "";  //"ab"
        
        for(int i= 0; i <= word.length()-1; i++){

            if(!result.contains(  ""+word.charAt(i) )) { // if the character is not conatined in the result yet
                result += word.charAt(i);       // then add the character to the sult
            }
            
        }


        System.out.println("result = " + result);
        
        
        
        
    }
    
    
}
