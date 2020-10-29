import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExcelFormula {
    private static String getContentFrom(String link) throws IOException {
        URL url = new URL(link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\\\R", "");
        return content;
    }
    public static void main(String[] args) throws IOException {
        String content = getContentFrom("https://www.giaiphapexcel.com/diendan/threads/tra-cứu-hàm-excel.7971/");
        // Regex
        // tên công thức
//        Pattern p1 = Pattern.compile("class=\"link link--internal\">(.*?)</a></b> <i>");
//        Matcher m1 = p1.matcher(content);
//        while (m1.find()) {
//            System.out.println(m1.group(1));
//        }
        // Link
//        Pattern p2 = Pattern.compile("href=\"(.*?)\" class=\"link link--internal\">");
//        Matcher m2 = p2.matcher(content);
//        while (m2.find()) {
//            System.out.println(m2.group(1));
//        }
//
//        //Mô tả công thức
        Pattern p3 = Pattern.compile("<i>\\(number\\)</i>(.*?)<br");
        Matcher m3 = p3.matcher(content);
        while (m3.find()) {
            System.out.println(m3.group(1));
        }
    }
}
