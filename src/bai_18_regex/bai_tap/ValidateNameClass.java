package bai_18_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String NAME_REGEX="^[ACP][0-9]{4}[GHIKLM]$";

    public static boolean validateName(String regex){
        Pattern pattern=Pattern.compile(NAME_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

}
