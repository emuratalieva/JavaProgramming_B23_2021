package Practice_07_07_2021;

public class LongestPalindrome {
    public static void main(String[] args) {

        /*
         Task 4 :  For Each - Nested For

    		Longest Palindrome

       		 Given a String array. Find the longest Palindrome String in your array.
			        Ex:
			        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
			        Ex:
			        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
			        Output: No palindrome
         */


        String words[]={"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
        String longestPalindrome="";

        for (String each:words ) {

            boolean isPalindrome=true;

            /*
            civic


            c  !=  c
            isPalindrome = false ;
            break ;




            racecar
            0123456

            r r

             */

            for (int i = 0; i < each.length()/2; i++) {

                char c = each.charAt(i);
                char c1= each.charAt(each.length()-1-i);
                if(each.charAt(i)!=each.charAt(each.length()-1-i)){
                    isPalindrome=false;
                    break;
                }
            }


            if(isPalindrome && each.length()>longestPalindrome.length()){
                longestPalindrome=each;
            }

        }

        System.out.println("longestPalindrome = " + longestPalindrome);


    }
}


/*String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
            }
            isPalindrome=reverse.equalsIgnoreCase(each);
            */