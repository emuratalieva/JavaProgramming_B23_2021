package Practice_06_23_2021.StringQuiz;

public class Q4 {
    public static void main(String[] args) {

        String str1="Java";    // literal
        String str2=new String("java");  // new Keyword

        //  (str1==str2)   False
        //  (str1.equals(str2))    False
        //  (str1.equalsIgnorecase(str2))    True

        if(str1.equalsIgnoreCase(str2)){
        System.out.println("Equal");

        }else
        {
            System.out.println("Not Equal");
        }
    }

    }

