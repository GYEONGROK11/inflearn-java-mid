package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        //now() ,of()
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜=" + nowDate);
        System.out.println("지정 날짜=" + ofDate);

        //계산(불변)
        LocalDate ofDate1 = ofDate.plusDays(10);
        //plusYears(), plusMonths(), plusWeeks(), plusDays()
        System.out.println("지정 날짜+10d = " + ofDate);
        System.out.println("지정 날짜+10d = " + ofDate1);
    }
}
