package seedu.addressbook.data.exception;
/**
 * Signals that storage file is missing.
 */
public class NoStorageFileException extends Exception {
    /**
     * @param message should contain relevant information on the failed constraint(s)
     */
    public NoStorageFileException(String message) {
        super(message);
    }
}
