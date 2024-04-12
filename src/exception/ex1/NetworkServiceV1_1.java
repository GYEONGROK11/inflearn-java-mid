package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        // 1_1은 연결이 실패해도 데이터 전송함,오류로그도 보고싶음 - 1_2에서 수정
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
