package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) { //try-with-resources try()안에 객체 생성
            //AutoCloseable을 구현한 객체만 사용 가능 - close()를 호출
            client.initError(data); //추가
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
