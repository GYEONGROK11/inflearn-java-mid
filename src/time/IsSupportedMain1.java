package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        //한계 : LocalDate는 시분초를 포함하지 않으므로 ChronoField.SECOND_OF_MINUTE을 지원하지 않음
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}
