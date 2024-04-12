package exception.ex1;

public class NetworkClientV1 {
    //예외처리 (연결과 보내기 에러) 추가
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }

        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {  //error1이 포함되어 있으면 연결 에러
                                        //contatins() 메서드는 문자열에 특정 문자열이 포함되어 있는지 확인하는 메서드
            connectError = true;
        }
        if (data.contains("error2")) {  //error2가 포함되어 있으면 전송 에러
            sendError = true;
        }
    }
}
