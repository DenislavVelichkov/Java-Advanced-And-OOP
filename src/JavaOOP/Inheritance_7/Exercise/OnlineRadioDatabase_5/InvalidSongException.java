package JavaOOP.Inheritance_7.Exercise.OnlineRadioDatabase_5;

public class InvalidSongException extends Throwable {
    private String message;

    public InvalidSongException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
