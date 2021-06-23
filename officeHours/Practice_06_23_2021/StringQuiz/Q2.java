package Practice_06_23_2021.StringQuiz;

public class Q2 {
    public static void main(String[] args) {
        String ta="A ";

        //ta  = A
        ta=ta.concat("B ");
        // ta = A B
        String tb="C ";
        ta=ta+tb;

        //ta = A B C
        ta.replace('C','D');
        //  A B D

        //ta = A B C

        ta=ta+tb;

        //ta = A B C C
        System.out.println(ta);
    }
}
