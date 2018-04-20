package lesLom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by java on 20.04.2018.
 */
public class lesLom {
    public static void main(String[] args) {

        String input = "Tania tania ";
        Pattern pattern = Pattern.compile("Tania");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
