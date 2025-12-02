package task2;

/**
 * Concrete Factory for creating File-related data access objects (FileReader and FileWriter).
 */
public class FileDataAccessFactory implements DataAccessFactory {
    /**
     * Creates a FileReader.
     * @return A FileReader instance.
     */
    @Override
    public DataReader createReader() {
        return new FileReader();
    }

    /**
     * Creates a FileWriter.
     * @return A FileWriter instance.
     */
    @Override
    public DataWriter createWriter() {
        return new FileWriter();
    }
}