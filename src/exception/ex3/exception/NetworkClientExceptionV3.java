package exception.ex3.exception;

public class NetworkClientExceptionV3 extends Exception {
    //예외 계층화 장점 : 예외 클래스를 확장하면 예외의 종류를 구분하기 쉬워진다. - 다른 로직 사용가능
                   // 상위 예외를 잡으면 자식 예외도 함께 잡힌다.
    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
