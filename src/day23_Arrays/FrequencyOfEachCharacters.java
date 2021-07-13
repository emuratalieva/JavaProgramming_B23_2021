package day23_Arrays;

public class FrequencyOfEachCharacters {

    public static void main(String[] args) {

        String str = "aabccc";  //a2b1c3

        // step 1
        String removeDup = ""; //abc
        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);

            if(  removeDup.contains( ""+ch) ){ // if the character is already contained in removeDup
                continue; // skip it
            }

            removeDup += ch;
        }

        String result = "";  //a2b1c3
                             //a b c
                             //2 1 3

        // step3
        for(int j = 0; j <= removeDup.length()-1; j++){ // 0 1 2, outer loop is used for getting each characters from string removeDup

            //step2
            char ch = removeDup.charAt(j);  //'a', 'b', 'c'
            int frequency = 0; // for the frequencies of ch: 2  1  3
            for (int i = 0; i <= str.length()-1 ; i++) {  // inner loop is responsible for returning the frequency of ch
                char each = str.charAt(i);
                if(each == ch){
                    frequency++;
                }
            }

            result +=  ""+ch + frequency;

        }


        System.out.println(result);



    }


}

/*
2. find the frequency of each characters from astring

			str = "aabcccd";

			output:
				a2b1c3d1

	step1: need to know how to remove duplicates
	step2: need to know how to fidn the frequency of one character
	step3: use the loop and apply step 2 to the remaining characters of the string

 */
