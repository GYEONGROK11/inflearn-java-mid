package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";
        String str1 = "Hello, World";

        // format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        // printf
        System.out.printf("숫자: %.2f\n", 10.1234);

        // matches 메서드
        String regex = "Hello, (Java!|World)";  //정규표현식
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
        System.out.println("'str1'이 패턴과 일치하는가? " + str1.matches(regex));
    }
}
