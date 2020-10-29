import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String strg="^[ABC][0-9]{4}[GHIKLM]$";
        Pattern pattern=Pattern.compile(strg);
        System.out.println("Moi nhap ten lop :");
        String catcher=input.nextLine();
        Matcher matcher=pattern.matcher(catcher);
        System.out.println(matcher.matches());
    }
}
