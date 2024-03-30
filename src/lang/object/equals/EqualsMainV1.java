package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));  //동일성 비교
        System.out.println("equality = " + (user1.equals(user2)));  //동등성 비교

        //동일성 - 완전히 같은 존재, 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인함
        //동등성 - 논리적으로 같은 지

    }
}
