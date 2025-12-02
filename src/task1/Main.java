package task1;

/**
 * Main class to demonstrate the Prototype and Composite patterns for the file system model.
 * It demonstrates shallow vs deep cloning and the independence of copies.
 */
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory images = new Directory("Images");

        File readme = new File("README.txt", 100);
        File report = new File("Report.docx", 500);
        File photo = new File("photo.jpg", 1200);

        documents.add(readme);
        documents.add(report);
        images.add(photo);

        root.add(documents);
        root.add(images);

        System.out.println("--- Original Structure ---");
        root.displayStructure("");

        FileSystemObject shallowCopy = root.clone(0);

        FileSystemObject deepCopy = root.clone(2);

        System.out.println("\n--- Structures After Cloning ---");
        shallowCopy.displayStructure("");
        deepCopy.displayStructure("");

        readme.setName("NEW_README.txt");

        System.out.println("\n--- Structures After Modification to Original's Child ---");

        System.out.println("\n--- Original Structure ---");
        root.displayStructure("");

        System.out.println("\n--- Shallow Copy (depth=0) Structure ---");
        shallowCopy.displayStructure("");

        System.out.println("\n--- Deep Copy (depth=2) Structure ---");
        deepCopy.displayStructure("");

        shallowCopy.setName("Shallow_Root_Copy");
        deepCopy.setName("Deep_Root_Copy");

        System.out.println("\n--- Final Check on Root Names ---");
        root.displayStructure("");
        shallowCopy.displayStructure("");
        deepCopy.displayStructure("");
    }
}