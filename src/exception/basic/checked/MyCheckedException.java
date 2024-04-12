package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다. - 런타임 익셉션 제외
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) { //오류메세지 보관
        super(message);
    }
}
