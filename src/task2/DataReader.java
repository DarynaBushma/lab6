package task2;

/**
 * Abstract Product interface for reading data (e.g., records or files).
 */
public interface DataReader {
    /**
     * Reads data from the source (DB or File).
     * Implemented as a business stub.
     * @return The read data object (null in this stub).
     */
    Object readData();
}