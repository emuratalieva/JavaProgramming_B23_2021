package day16_String;

public class WebName {

    public static void main(String[] args) {

        String url = "www.cybertek.gov";

        int beginning = url.indexOf(".")+1;
        int end =  url.lastIndexOf(".");

        String name = url.substring( beginning ,  end );
        String domain = url.substring( end + 1 );
        System.out.println(name);
        System.out.println(domain);







    }

}
