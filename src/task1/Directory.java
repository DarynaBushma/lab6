package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a directory (Composite in Composite, Concrete Prototype).
 * It can contain other FileSystemObjects and implements the cloning logic
 * with respect to depth for its children.
 */
public class Directory extends FileSystemObject {
    private List<FileSystemObject> children = new ArrayList<>();

    /**
     * Constructor for Directory.
     * @param name The name of the directory.
     */
    public Directory(String name) {
        super(name);
    }

    /**
     * Adds a file system object to the directory's contents.
     * @param obj The FileSystemObject to add.
     */
    @Override
    public void add(FileSystemObject obj) {
        System.out.println("Business stub: add(FileSystemObject) called for Directory: " + name);
        this.children.add(obj);
    }

    /**
     * Calculates the total size of the directory and all its contents recursively.
     * @return The total size in bytes.
     */
    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemObject child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    /**
     * Displays the structure of the directory and its contents recursively.
     * @param indent The indentation string.
     */
    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "Directory: " + name + " (" + getSize() + " bytes)");
        String nextIndent = indent + "  ";
        for (FileSystemObject child : children) {
            child.displayStructure(nextIndent);
        }
    }

    /**
     * Creates a copy of the Directory object with deep or shallow cloning of children
     * based on the depth parameter.
     * @param depth The cloning depth level.
     * @return A cloned Directory object.
     */
    @Override
    public FileSystemObject clone(int depth) {
        System.out.println("Prototype stub: clone(depth=" + depth + ") called for Directory: " + name);
        Directory newDirectory = new Directory(this.name);

        if (depth == 0) {
            newDirectory.children = this.children;
        } else if (depth > 0) {
            int nextDepth = depth - 1;
            for (FileSystemObject child : this.children) {
                newDirectory.add(child.clone(nextDepth));
            }
        }
        return newDirectory;
    }
}