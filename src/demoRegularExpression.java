import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demoRegularExpression {
    public static void main(String[] args) {
//        boolean a = "Java is fun".matches("Java.*");
//        boolean b = "Java is cool".matches("Java.*");
//        boolean c = "Java is powerful".matches("Java.*");
//
//        System.out.println("a:" +  a);
//        System.out.println("b:" +  b);
//        System.out.println("c:" +  c);

//        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
//
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//
//        Matcher matcher = pattern.matcher(text1);
//
//        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
//
//        while (matcher.find()) {
//
//            System.out.println(text1.substring(matcher.start(), matcher.end()));
//
//        }
//
//        String text2 = "2/12/2018";
//
//        String text3 = "12/12/aaaa";
//
//        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
//
//        System.out.println("\nChuỗi " + text2 + " có định dạng ngày tháng: "
//
//                + pattern.matcher(text2).matches());
//
//        System.out.println("Chuỗi " + text3 + " có định dạng ngày tháng: "
//
//                + pattern.matcher(text3).matches());

        System.out.println("Java Java Java".replaceAll("v\\w", "wi"));
        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));

        String str = "Welcome   to gpcoder";

// Ký tự bất kỳ xuất hiện nhiều lần lần và kết thúc là r
        String regex = ".*r$";
// Tạo đối tượng Pattern thông qua method tĩnh.
        Pattern pattern = Pattern.compile(regex);

// Lấy ra đối tượng Matcher
        Matcher matcher = pattern.matcher(str);

// Kiểm tra có khơp với regex không
        boolean match = matcher.matches();
        System.out.println("Match = " + match); // Match = true
    }
}
