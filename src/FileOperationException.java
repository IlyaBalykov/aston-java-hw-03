public class FileOperationException extends Exception{
    private int code;

    public FileOperationException(String message, int code) {
        super(message);
        this.code = code;
    }

    public FileOperationException (String message, Throwable cause) {
        super(message, cause);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
