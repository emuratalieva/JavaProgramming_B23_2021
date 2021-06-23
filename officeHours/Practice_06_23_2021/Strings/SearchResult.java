package Practice_06_23_2021.Strings;

public class SearchResult {
    public static void main(String[] args) {


        /*

				Task 3 : Assume that you searched a word in Google  Search Engine.After that you took a result message like 		 this


						 "About 3,640,000,000 results (0.78 seconds)"

						 According to this result print out search Time and number of Result

						 Input :  "About 640,000,000 results (0.78 seconds)"

						 Output:
						 			Result number is 640,000,000
						 			Response time is 0.78 seconds          */


        String result= "About 4,000,000 results (0.78 seconds)";

        // "About 3,640,000,000 results (0.78 seconds)"
        //  01234567890123456789

        int startIndex=result.indexOf(" ");
        int endIndex=result.indexOf(" r");

        System.out.println(startIndex);
        System.out.println(endIndex);

        String searchResult=result.substring(startIndex+1,endIndex);

        System.out.println("searchResult = " + searchResult);

        int firstIndex=result.indexOf("(");
        int lastIndex=result.indexOf(")");

        String searchTime=result.substring(firstIndex+1,lastIndex);
        System.out.println("searchTime = " + searchTime);


    }
}
