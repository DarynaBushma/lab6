package task1;

/**
 * Abstract base class for all file system elements (files and directories).
 * It serves as the Component in the Composite pattern and defines the
 * cloning interface for the Prototype pattern.
 */
public abstract class FileSystemObject {
    protected String name;

    /**
     * Constructor for FileSystemObject.
     * @param name The name of the file system object.
     */
    public FileSystemObject(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the file system object.
     * @return The object's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new name for the file system object.
     * Demonstrates a business logic method implemented as a stub.
     * @param name The new name.
     */
    public void setName(String name) {
        System.out.println("Business stub: setName with parameter name=" + name + " called for " + this.name);
        this.name = name;
    }

    /**
     * Gets the size of the object. For a File, it's the specific size.
     * For a Directory, it's the sum of its children's sizes.
     * @return The size in bytes.
     */
    public abstract int getSize();

    /**
     * Displays the structure of the file system object (and its children recursively).
     * @param indent The indentation string for formatting.
     */
    public abstract void displayStructure(String indent);

    /**
     * Creates a copy of the object with a specified cloning depth.
     * Implements the Prototype pattern.
     * depth = 0: shallow copy (references to sub-elements are copied).
     * depth > 0: deep copy to the specified level.
     * @param depth The cloning depth level.
     * @return A cloned FileSystemObject.
     */
    public abstract FileSystemObject clone(int depth);

    /**
     * Adds a file system object to the contents. Implemented as a stub for FileSystemObject.
     * Only relevant for Directory.
     * @param obj The FileSystemObject to add.
     */
    public void add(FileSystemObject obj) {
        System.out.println("Business stub: add(FileSystemObject) called for " + this.name);
    }
}