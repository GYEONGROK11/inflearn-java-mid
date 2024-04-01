package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //대소문자 구분없이 비교

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));  //사전적으로 1칸 차이임
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); //이 문자열로 시작되는지
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));  //이 문자열로 끝나는지
    }
}
