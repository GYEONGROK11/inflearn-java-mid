package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        //메인밖으로 예외를 던져 오류가 발생
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
