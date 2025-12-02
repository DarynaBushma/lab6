package task2;

/**
 * Concrete Factory for creating Database-related data access objects (DbReader and DbWriter).
 */
public class DbDataAccessFactory implements DataAccessFactory {
    /**
     * Creates a DbReader.
     * @return A DbReader instance.
     */
    @Override
    public DataReader createReader() {
        return new DbReader();
    }

    /**
     * Creates a DbWriter.
     * @return A DbWriter instance.
     */
    @Override
    public DataWriter createWriter() {
        return new DbWriter();
    }
}