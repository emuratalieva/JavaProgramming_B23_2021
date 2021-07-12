package day30_Recap;

public class LoopsReview {

    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        System.out.println("-------------------------------------------");

        for(int i = 1; i < 11; i++ ){ //i : 1,2,3,4,5,6,7,8,9,10
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

       for(int i = 1; i <= 20; i++ ){ // i: 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 .. 20
           if(i%2 == 0) {
               System.out.print(i + " ");
           }
       }

        System.out.println();

        System.out.println("------------------------------------------------");

        String str = "Java";
        //            0123

        for(int i= str.length()-1; i >=  0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();

        System.out.println("-----------------------------------------------------------");

        for(int i = 1, ch = 65;  i <= 26; i++, ch++   ){
            System.out.println(i +". "+  (char)ch);
        }

        System.out.println("-------------------------------------------");

        for(int i = 26, ch = 90;  i >= 1; i--, ch-- ){
            System.out.println(i +". "+  (char)ch);
        }

        System.out.println("--------------------------------------------");

        for (char i = 'A', j='a'; i <= 'Z' ; j++, i++ ){
            System.out.println(i +"-"+j);
        }


        System.out.println("-----------------------------------------");
        String word = "Python";
        //             012345

        String reverse = "";
        for (int i = word.length()-1; i >=0; i--){ // i: index nums of word (in reversed order)
            reverse += word.charAt(i);
        }

        boolean isPPalindrome = word.equalsIgnoreCase(reverse);


        System.out.println("isPPalindrome = " + isPPalindrome);

    }
}
