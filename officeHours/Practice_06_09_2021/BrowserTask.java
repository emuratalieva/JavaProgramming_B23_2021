package Practice_06_09_2021;

public class BrowserTask {

    public static void main(String[] args) {
        /*
        Task  : Create  a program that accepts browserName and operatingSystem as String and isBrowserOpen as boolean

				        If the Browser is closed, try to open the corresponding browsers in that operating system to run your code.


				        		=== These browsers can be opened in these operatingSystem ===

				                    chrome   		    --- > mac - windows
				                    chrome-headless 	--- > mac - windows
				                    firefox-headless    --- > mac - windows
				                    firefox             --- > mac - windows
				                    remote-chrome  		--- > mac - windows
				                    ie 					--- > windows
				                    edge 				--- > windows
				                    safari 			    --- > mac

				                    According to related browserName and operatingSystem it should give

				                    	"Browser is opened successfully with $browserName in $operatingSystem"

				                    if operatingSystem does not support $browserName

				                    	"Your $operatingSystem doesn't support ie"

				         If the Browser is already opened it should give an error message

				        	"Browser is already opened with $browserName in $operatingSystem"

				                    EXAMPLES

				                    INPUTS :                        EXPECTED OUTPUT : Browser is opened successfully with chrome in mac
				                            isBrowserOpen=false
				                            browserName=chrome
				                            operatingSystem=mac

				                    INPUTS :                        EXPECTED OUTPUT : Browser is opened successfully with chrome in windows
				                            isBrowserOpen=false
				                            browserName=chrome
				                            operatingSystem=windows

				                    INPUTS :                        EXPECTED OUTPUT : Your mac doesn't support ie
				                            isBrowserOpen=false
				                            browserName=ie
				                            operatingSystem=mac

				                    INPUTS :                        EXPECTED OUTPUT : Your mac doesn't support edge
				                            isBrowserOpen=false
				                            browserName=edge
				                            operatingSystem=mac

				                   INPUTS :                        EXPECTED OUTPUT : Your windows doesn't support safari
				                            isBrowserOpen=false
				                            browserName=safari
				                            operatingSystem=windows

				                   INPUTS :                         EXPECTED OUTPUT : Browser is already opened with safari in mac
				                            isBrowserOpen=true
				                            browserName=safari
				                            operatingSystem=mac



				         */

        boolean isBrowserOpen=false;
        String browserType="safari";
        String operatingSystem="windows";


        if(isBrowserOpen==false){

            switch(browserType){

                case "chrome":
                case "chrome-headless":
                case "firefox":
                case "firefox-headless":
                case "remote-chrome":
                    System.out.println("Browser is opened successfully with "+browserType+" in "+operatingSystem);
                    break;
                case "ie":
                case "edge":
                    if(operatingSystem!="mac"){
                        System.out.println("Browser is opened successfully with "+browserType+" in "+operatingSystem);

                    }
                    else
                    {
                        System.err.println("Your "+operatingSystem+" doesn't support "+browserType);

                    }
                    break;
                case "safari":
                    if(operatingSystem!="windows"){
                        System.out.println("Browser is opened successfully with "+browserType+" in "+operatingSystem);

                    }
                    else
                    {
                        System.err.println("Your "+operatingSystem+" doesn't support "+browserType);

                    }
                    break;
            }


        }else
        {
            System.err.println("Browser is already opened with "+browserType+" in "+operatingSystem);
        }

    }
}
