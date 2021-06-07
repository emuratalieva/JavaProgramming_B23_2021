package day11_Switch;

public class NestedIfPractice {

    public static void main(String[] args) {

        /*
        4. In Cybertek we have three batch types: US morning, US evening, EU.
		Depending on a batch type (String) print information about the batch.
		First figure out is is a US batch or EU batch
		    - for US batches:
		        > Figure out is it a morning batch or evening batch
		            > morning - print: Class times are 10-5 EST. M, T, Th, F.
		            > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
		    - for EU batches:
		        > print: Class times are  10-5 EST. M, T, W, Th, F.
        If Batch type is not EU or US, print Invalid Batch
        		NOTE: MUST APPLY NESTED IF
         */

        String batchType = "US morning";
        boolean isValid = batchType == "US morning" || batchType == "US evening" || batchType == "EU";
        String result = "";

        if(isValid){
            if(batchType == "US morning"){
                result = "10am-5pm EST. M, T, Th, F";
            }else if(batchType == "US evening"){
                result = "7pm-10pm EST. M, T, W, Th, S, S";
            }else{
                result = "10am-5pm EST. M, T, W, Th, F";
            }
        }else{
            result = "Invalid Batch";
        }

        System.out.println("result = " + result);

        System.out.println("------------------------------------------");
        /*
        5. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

                  NOTE: MUST APPLY NESTED IF
         */

        int age = 45;
        String ageGroup = "";

        if( age >= 0 && age <= 150){
            if(age < 21){
                ageGroup = "Teenager";
            }else if(age >= 21 && age < 55){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }
        }else{
            ageGroup = "Invalid";
        }

        System.out.println("ageGroup = " + ageGroup);











    }


}