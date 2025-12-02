package task1;

/**
 * Represents a concrete file (Leaf in Composite, Concrete Prototype).
 * It does not contain other elements.
 */
public class File extends FileSystemObject {
    private int size;

    /**
     * Constructor for File.
     * @param name The name of the file.
     * @param size The size of the file in bytes.
     */
    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    /**
     * Gets the specific size of the file.
     * @return The size in bytes.
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Displays the file's structure (itself).
     * @param indent The indentation string.
     */
    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + " bytes)");
    }

    /**
     * Clones the File object. Since it is a leaf, depth does not affect the outcome
     * beyond the object itself being fully copied (always deep for its state).
     * @param depth The cloning depth (ignored for leaf).
     * @return A new File object (a copy).
     */
    @Override
    public FileSystemObject clone(int depth) {
        System.out.println("Prototype stub: clone(depth=" + depth + ") called for File: " + name);
        return new File(this.name, this.size);
    }
}