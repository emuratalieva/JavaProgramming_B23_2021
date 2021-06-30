package Practice_30_06_2021;

public class CamelCase2 {
    public static void main(String[] args) {
        /*
         Task 2  : Find and print each words are in the given String.

								        Input: thisHasManyWordsToFind
								        Output: This
								        		Has
								        		Many
								        		Words
								        		To
								        		Find
         */
        String str="thisHasManyWordsToFind";
        String temp="";

        int count=1;

        if(str.isEmpty())
            count=0;

        for (int i = 0; i <str.length() ; i++) {


            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                System.out.println(temp);
                temp="";

            }
            if(i==0){
                temp+=(""+str.charAt(i)).toUpperCase();
            }else {
                temp+=str.charAt(i);   // Find

            }

        }
        System.out.println(temp);


    }
}
