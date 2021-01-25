import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static boolean test(String pattern, String s) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static void main(String[] args) {

        String pattern = "[Тт]а[йи]ланд";
        String str = "таиланд красивая страна";
        System.out.println(test(pattern, str));
        System.out.println(str.replaceAll(pattern,"Россия"));
    }
}
