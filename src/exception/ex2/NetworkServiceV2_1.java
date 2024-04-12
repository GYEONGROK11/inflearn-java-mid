package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        //에러를 던지면서 프로그램이 종료됨 V2_2에서 처리
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
