package exception.ex2;

public class NetworkClientV2 {
    //정상흐름과 예외흐름을 분리해보자
    //V1은 반환받은 값으로 처리를 하여 정상흐름을 한눈에 알아보기 어려움 - 정상흐름 예외흐름이 섞임
    //V2는 try-catch문을 사용하여 예외처리를 하여 예외흐름을 따로 분리하여 알아보기 쉬움
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {  //반환값을 받을 필요 없이 void로 처리
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2{
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            //중간에 다른 예외가 발생했다고 가정
            //throw new RuntimeException("ex");  //V2_4처럼 모르는 예외가 발생시 send에서 프로그램 종료됨 finally로 연결해제를 무조건 실행해줌
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
