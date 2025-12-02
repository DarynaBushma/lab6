package task2;

/**
 * Main class to demonstrate the Abstract Factory pattern for data access tools.
 * The client code works with abstract interfaces, allowing transparent switching 
 * between DB and File access tool families.
 */
public class Main {
    /**
     * Client method that uses the abstract factory and products.
     * This logic is independent of the concrete factories/products.
     * @param factory The DataAccessFactory instance (Concrete Factory).
     */
    public static void useDataAccessTools(DataAccessFactory factory) {
        System.out.println("\nUsing Factory: " + factory.getClass().getSimpleName());

        DataReader reader = factory.createReader();
        DataWriter writer = factory.createWriter();

        Object data = reader.readData();
        writer.writeData("Sample data");
    }

    public static void main(String[] args) {
        DataAccessFactory dbFactory = new DbDataAccessFactory();
        useDataAccessTools(dbFactory);

        DataAccessFactory fileFactory = new FileDataAccessFactory();
        useDataAccessTools(fileFactory);
    }
}