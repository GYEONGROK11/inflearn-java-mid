package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values(); //날짜 및 시간의 이넘 상수 - 실질적 날짜 계산을 가능하게함
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
            //range는 각각 범위를 나타냄 ex) SecondOfMinute, range = 0 - 59 - 1분중에 초는 0~59초까지 가능
        }

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}
