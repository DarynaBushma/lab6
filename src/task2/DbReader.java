package task2;

/**
 * Concrete Product implementing data reading from a Database.
 */
public class DbReader implements DataReader {
    /**
     * Reads data from the database.
     * @return The read data object (null in this stub).
     */
    @Override
    public Object readData() {
        System.out.println("Business stub: readData() called. Reading data from Database.");
        return null;
    }
}