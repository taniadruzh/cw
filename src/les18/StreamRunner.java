package les18;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by java on 30.03.2018.
 */
public class StreamRunner {
    public static void main(String[] args) throws IOException {
        try(InputStream inputStream = new URL("https://www.google.com.ua").openStream()) {
            int i = -1;
            int spaceCount = 0;
            int slashCount = 0;
            int trCount = 0;

            while ((i = inputStream.read()) != -1) {
                if ((char) i == ' ') {
                    spaceCount++;
                }
                if ((char) i == '/') {
                    slashCount++;
                }
                if ((char) i == '>') {
                    trCount++;
                }
            }
            System.out.println("spaces: " + spaceCount);
            System.out.println("slashes: " + slashCount);
            System.out.println(">: " + trCount);
        }


    }
}
