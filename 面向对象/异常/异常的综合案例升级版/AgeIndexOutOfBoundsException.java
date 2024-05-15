package 异常.异常的综合案例升级版;

public class AgeIndexOutOfBoundsException extends RuntimeException{
    public AgeIndexOutOfBoundsException() {}

    public AgeIndexOutOfBoundsException(String message) {
        super(message);
    }
}
