package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        //성공케이스일때 예외처리없음
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
