package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        //finally로 에러가 발생해도 연결해제를 무조건 실행해줌
        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {  //반드시 호출해야 하는 마무리 흐름 - 주로 try에서 사용한 자원을 닫을 때 사용, catch에 잡혀 throw로 빠지기 전에 실행됨
            client.disconnect();
        }

    }
}
