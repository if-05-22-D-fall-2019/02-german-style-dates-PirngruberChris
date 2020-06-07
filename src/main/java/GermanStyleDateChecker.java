import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "^(3(1|0)|[0-2]?\\d)(\\.|\\-|\\s)(0?\\d|1[0-2])(\\.|\\-|\\s)(19|20)?\\d\\d$";
        Patter pattern = pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateString);



        return matcher;
    }
}
