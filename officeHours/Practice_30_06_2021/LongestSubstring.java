package Practice_30_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        /*
        Task 4 :  For

						  Biggest substring of matching characters
						  Given a String find the biggest substring of chars that match and print it.

						  Ex: aaabbbcccccddddee Output: ccccc
						        a=3
						        b=3
						        c=5
						        d=4
						        e=2
         */
        String str="aaabbbcccccddddeeeeee";
        String longestSubstring="";
        String temp="";
        for (int i = 0; i <str.length()-1 ; i++) {

                temp+=str.charAt(i);
                // ccccc

                if(str.charAt(i)!=str.charAt(i+1) || i==str.length()-2){

                    if(i==str.length()-2 && str.charAt(i)==str.charAt(i+1))
                    {
                        temp+=str.charAt(i+1);
                    }

                    if(temp.length()>longestSubstring.length()){
                        longestSubstring=temp;
                    }
                    temp="";
                }
        }
        System.out.println(longestSubstring);


    }
}
