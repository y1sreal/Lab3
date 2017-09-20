import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class CS125 {

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {

       String URL1 = urlToString("http://erdani.com/tdpl/hamlet.txt");
       System.out.println(URL1.length());
       String URL2 = urlToString("https://www.bls.gov/tus/charts/chart9.txt");
       System.out.println(URL2.length());
       String URL3 = urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
       System.out.println(URL3.length());
       String URL4 = urlToString("https://cs.illinois.edu/");
       System.out.println(URL4.length());
    }
}
