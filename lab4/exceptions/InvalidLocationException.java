package lab3.exceptions;

public class InvalidLocationException extends RuntimeException {
    public InvalidLocationException() {
        super("Персонаж не может вести диалог с персонажем из другой локации.");
    }
}
