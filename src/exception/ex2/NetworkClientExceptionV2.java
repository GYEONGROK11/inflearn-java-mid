package exception.ex2;

public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;  //success, fail, error404, error500등 상태코드를 저장

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
