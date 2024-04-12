package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();  //예외처리 도입, 복구는 안됨 - 프로그램 종료됨
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();  //예외처리 도입, 복구는 됨 - 정상흐름과 예외흐름 구분X, 리턴되서 연결해제는 실행 안됨
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();  //정상흐름과 예외흐름 구분, 리턴되서 연결해제는 실행 안됨
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();  //try catch 밖으로 빼서 연결해제 실행됨, 하지만 모르는 예외발생시 프로그램 종료됨
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();    //finally로 에러가 발생해도 연결해제를 무조건 실행해줌

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
