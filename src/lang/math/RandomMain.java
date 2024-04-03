package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(2);
        //seed가 같으면 Random의 결과가 같다 - 결과가 고정되기 때문에 Test할 때 사용

        int randomInt = random.nextInt();  //정수 중 랜덤
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble();//0.0d ~ 1.0d
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();  //불린중 랜덤
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);//0 ~ 9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;// 1 ~ 10까지 출력
        System.out.println("1 ~ 10: " + randomRange2);
    }
}
