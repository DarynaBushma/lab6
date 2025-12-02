package task2;

/**
 * Concrete Product implementing data writing to a Database.
 */
public class DbWriter implements DataWriter {
    /**
     * Writes data to the database.
     * @param data The data object to write.
     */
    @Override
    public void writeData(Object data) {
        System.out.println("Business stub: writeData with parameter data='" + data + "' called. Writing data to Database.");
    }
}