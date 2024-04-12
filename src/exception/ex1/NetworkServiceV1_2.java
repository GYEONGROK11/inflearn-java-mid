package exception.ex1;

import java.util.List;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        String connectResult = client.connect(); //리턴값을 받아서 처리, 연결 성공이 아니면 에러
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        String sendResult = client.send(data);  //리턴값을 받아서 처리, 전송 성공이 아니면 에러
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }
        // 1_2은 실패하면 리턴 항상 서버 연결 해제를 해야됨 - 1_3에서 수정
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");  //연결 성공이 아니면 에러
    }
}
