import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSDT {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX ="\\d{2}-\\d{9}";
    public ValidateSDT() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class TestValidateSDT{
    public static void main(String[] args) {
        boolean check;
        ValidateSDT validateSDT=new ValidateSDT();
        do {
            System.out.print("Moi nhap SDT :");
            Scanner input = new Scanner(System.in);
            String phoneNumber = new String(input.nextLine());
            check = validateSDT.validate(phoneNumber);
            System.out.println(check);
        }while (check);

    }
}
