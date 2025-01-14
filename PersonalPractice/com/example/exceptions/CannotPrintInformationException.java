package PersonalPractice.com.example.exceptions;

public class CannotPrintInformationException extends Exception {
    public CannotPrintInformationException(String message) {
        super(message);
    }

    public CannotPrintInformationException() {
        super();
    }
}
