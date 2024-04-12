package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        //리턴해서 디스커넥트를 실행 해야됨   V2_4에서 처리

        //정상흐름을 나열하여 구분함
        try {                      //순차적 실행 - 예외터지면 바로 catch로 이동
            client.connect();
            client.send(data);
            client.disconnect();  //예외 발생시 disconnect가 실행되지 않음
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
    }
}
