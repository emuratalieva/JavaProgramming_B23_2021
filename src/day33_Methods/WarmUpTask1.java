package day33_Methods;

public class WarmUpTask1 {

    //create a method that can reverse an array of integer
    public static int[] reverse (int[] array){ //{1,2,3,4,5}
        int[] result = new int[array.length]; //{0,0,0,0,0}
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    //create a method that can reverse an array of double
    public static double[] reverse (double[] array){ //{1,2,3,4,5}
        double[] result = new double[array.length]; //{0,0,0,0,0}
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    //create a method that can reverse an array of String
    public static String[] reverse (String[] array){ //{1,2,3,4,5}
        String[] result = new String[array.length]; //{0,0,0,0,0}
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }

    //create a method that can reverse an array of char
    public static char[] reverse (char[] array){ //{1,2,3,4,5}
        char[] result = new char[array.length]; //{0,0,0,0,0}
        for (int i = array.length-1, j=0; i >=0; i--, j++){
            result[j] = array[i];
        }
        return result;
    }



}

/*
Task 1:
		1. create a method that can reverse an array of integer

		2. create a method that can reverse an array of double

		3. create a method that can reverse an array of String

		4. create a method that can reverse an array of char

 */