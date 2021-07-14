package Practice_07_14_2021.MethodTasks;

public class MinSteps {
    public static void main(String[] args) {
        String[] str={"x/","y/","../","z/","./"};
        System.out.println("minSteps(str) = " + minSteps(str));
    }
/*
 Number of Steps to Main directory  --- Interview Task

    			 We have a record of every time a change of directory is performed.The different change directory functions are as follow ;

    				 ../  Move to parent folder of current folder   -1
    				 ./   Remain in the same folder                  no need change counter
    				 x/   Move to the child folder named x           1


    				 Write a method to Find the minimum steps required to go back to main directory from current folder.The squence of operations performed after entering the main directory provided


    				 Input : {"x/","y/","../","z/","./"}

    				 Output : 2
 */

    public static int minSteps(String[] steps){
       //Input : {"x/","y/","../","z/","./"}
            int count=0;

        for (String each : steps) {
            switch(each){
                case "./":        // remain in same folder
                    break;
                case "../":       // go back for parent
                    count--;
                    break;
                default:         // child folders
                    count++;
                    break;
            }
        }

        return count;



    }


}
