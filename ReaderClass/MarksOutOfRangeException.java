package ReaderClass;

public class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        System.out.println("Marks are out of Range");
    }

}
