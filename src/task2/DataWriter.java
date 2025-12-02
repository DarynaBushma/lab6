package task2;

/**
 * Abstract Product interface for writing data (e.g., records or files).
 */
public interface DataWriter {
    /**
     * Writes data to the source (DB or File).
     * Implemented as a business stub.
     * @param data The data object to write.
     */
    void writeData(Object data);
}