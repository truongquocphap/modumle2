package bai_18_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX="^[0-9]{2}-0[0-9]{9,10}$";
    public static boolean validatePhoneNumber(String regex){
        Pattern pattern=Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
