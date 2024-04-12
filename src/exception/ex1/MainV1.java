package exception.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();  //연결실패해도 데이터를 전송함
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();  //실패하면 리턴 해서 연결 해제를 해야됨
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

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
