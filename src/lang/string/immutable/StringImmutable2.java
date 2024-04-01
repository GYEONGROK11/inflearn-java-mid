package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        //불변으로 설계된 이유
        //문자열 풀을 사용할 때 사이드 이펙트 발생이 되기 때문에
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
