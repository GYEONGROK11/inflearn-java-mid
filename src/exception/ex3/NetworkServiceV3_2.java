package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
            //실전활용 : V3_2에서는 연결오류를 중요한 예외로 관리하고 싶음
            // 나머지는 네트워크 오류로 관리 - 그 외에는 알수없는 오류
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) { //어떤 예외든 잡음
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        //위에서 부터 세부적으로 잡음 아래로 내려갈수록 큰 에러 범위

        } finally {
            client.disconnect();
        }

    }
}
