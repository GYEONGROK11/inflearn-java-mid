package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { //예외 던지기
        //throw 는 새로운 예외 발생시킴
        //throws 는 예외를 던진다는 것을 선언

        //문제 상황
        throw new MyCheckedException("ex");
    }
}
