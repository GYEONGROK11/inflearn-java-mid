package exception.basic.unchecked;

public class Client {
    public void call() { //런타임 예외는 throws로 예외를 던지지 않아도 된다.
        throw new MyUncheckedException("ex");
    }
}
