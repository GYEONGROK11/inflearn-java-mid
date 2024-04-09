package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain { //시간사이의 간격을 시분초 단위로 나타냄

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        //계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간: " + plusTime);

        //시간 차이
        LocalTime start = LocalTime.of(9, 23);
        LocalTime end = LocalTime.of(11, 0);
        Duration between = Duration.between(start, end);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무 시간: " + between.toHours() + "시간" + between.toMinutesPart() + "분");
        System.out.println("근무 시간: " + between.toMinutes() + "분");
        //미닛은 : 전체 분, 미닛파트는 : 시간 빼고 남은 분

    }
}
