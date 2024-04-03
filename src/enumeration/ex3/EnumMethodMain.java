package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());
            //name() : 이름,  ordinal() : 순서
            //ordinal()은 가급적 사용하지 않음 - 상수를 추가하면 순서가 바뀔 수 있음
        }

        //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        String input2 = "GOLDS";
        Grade gold = Grade.valueOf(input);
        //Grade gold2 = Grade.valueOf(input2);
        System.out.println("gold = " + gold); //toString() 오버라이딩 가능
    }
}
