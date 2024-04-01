package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));  //오버라이딩 되어있음 : 동등성 비교

        String str3 = "hello"; //x003
        String str4 = "hello"; //x004?  x003
        //리터럴 값을 넣었을때 - 메모리 최적화를 위해 문자열 풀이라는 공간을 사용함
        //str3을 생성할 때 문자열 풀에 hello를 만들고 str4를 만들때 풀에 있는지 확인, 있으면 객체를 만들지 않음
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
