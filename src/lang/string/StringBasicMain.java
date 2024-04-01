package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        //String의 다양한 기능
        int length = str1.length();
        char c = str1.charAt(1);
        String substring = str1.substring(1, 3);
        int l = str1.indexOf('l');
        String trim = str1.trim();
        String upperCase = str1.toUpperCase();
        String lowerCase = str1.toLowerCase();
        String concat = str1.concat(str2);
        String s = str1 + str2;

    }
}
