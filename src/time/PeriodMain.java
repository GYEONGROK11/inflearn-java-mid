package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMain { //시간사이의 간격을 년월일 단위로 나타냄

    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        //기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 5, 15);
        Period between = Period.between(startDate, endDate);
        System.out.println(between);
        System.out.println("기간: " + between.getMonths() +"개월 " + between.getDays() + "일");
    }
}
