package 异常.异常的综合案例升级版;

public class NameformatException extends RuntimeException{
    public NameformatException() {}

    public NameformatException(String message) {
        super(message);
    }
}
