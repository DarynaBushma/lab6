package task2;

/**
 * Concrete Product implementing data writing to a File.
 */
public class FileWriter implements DataWriter {
    /**
     * Writes data to the file.
     * @param data The data object to write.
     */
    @Override
    public void writeData(Object data) {
        System.out.println("Business stub: writeData with parameter data='" + data + "' called. Writing data to File.");
    }
}