package _19_string_regex.excercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASSNAME_REGEX = "[CPA][0-9]{4}[GHIKLM]";
    public ValidateClassName() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }
    public boolean validateClassName(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
