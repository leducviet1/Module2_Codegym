import java.util.regex.Pattern;

public class Validate {
    private static final Pattern PhonePattern = Pattern.compile("^(0|\\+84)[0-9]{9}$");
    private static final Pattern EmailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    public static boolean isValidPhone(String phone){
        return PhonePattern.matcher(phone).matches();
    }
    public static boolean isValidEmail(String email){
        return EmailPattern.matcher(email).matches();
    }
}
