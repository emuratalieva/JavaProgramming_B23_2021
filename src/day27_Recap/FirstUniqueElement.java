package day27_Recap;

public class FirstUniqueElement {



    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,1,1,1,1};
        int firstUniqueElement = 0;

/*
        for(int j =0; j < nums.length; j++) {// outer loop: responsible for repeating the inner loop to find frequency of each element

            int frequency = 0;
            for (int i = 0; i < nums.length; i++) {  // inner loop: responsible for finding the frequency of one element
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }

            if(frequency == 1){ // if element is unique
               firstUniqueElement = nums[j];
               break;  // to make sure only the first unique element is returned from the loop
            }

        }

 */

        for(int each  : nums ) {// outer loop: responsible for repeating the inner loop to find frequency of each element

            int frequency = 0;
            for (int element : nums) {  // inner loop: responsible for finding the frequency of one element
                if (element == each) {
                    frequency++;
                }
            }

            if(frequency == 1){ // if element is unique: 2, 4
                firstUniqueElement = each;
               break;  // to make sure only the first unique element is returned from the loop
            }

        }


       System.out.println("firstUniqueElement = " + firstUniqueElement);





    }

}

/*
write a program that can return the first unique element from the arrat
 */
