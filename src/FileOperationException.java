public class FileOperationException extends Exception{
    private int code;

    public FileOperationException(String message) {
        super(message);
    }

    public FileOperationException (String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
