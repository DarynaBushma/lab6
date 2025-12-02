package task2;

/**
 * Abstract Factory interface for creating a family of related data access objects
 * (DataReader and DataWriter).
 * Client code interacts only with this interface, ensuring system flexibility.
 */
public interface DataAccessFactory {
    /**
     * Creates an abstract DataReader product.
     * @return An implementation of DataReader.
     */
    DataReader createReader();

    /**
     * Creates an abstract DataWriter product.
     * @return An implementation of DataWriter.
     */
    DataWriter createWriter();
}