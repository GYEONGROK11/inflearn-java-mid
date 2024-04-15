package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
            //개발자 입장에서 이런 예외를 복구할 수 없음
        } finally {
            client.disconnect();
        }

    }
}
