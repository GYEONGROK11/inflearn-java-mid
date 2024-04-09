package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); //다음달 직전까지 출력

        //월요일=1(1%7=1) ... 일요일7(7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");  // 첫날을 위한 띄어쓰기
        }

        LocalDate dayIterator = firstDayOfMonth;  //1일부터 찍어줌
        while (dayIterator.isBefore(firstDayOfNextMonth)) { //- 마지막 전까지(다음달 직전)
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {  //토요일 마다 엔터
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
