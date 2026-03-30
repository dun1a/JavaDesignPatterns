package Assignment;

public class Main {

    public static void main(String[] args) {

        Directory rootDirectory = new Directory();

        FileSystemElement file1 = new File("file1", 100);
        FileSystemElement file2 = new File("file2.txt", 200);
        FileSystemElement file3 = new File("file3.txt", 300);

        rootDirectory.addFile(file1);
        rootDirectory.addFile(file2);
        rootDirectory.addFile(new File("file3.txt", 300));

        Directory rootDirectory2 = new Directory();
        rootDirectory2.addFile(file3);

        rootDirectory.addFile(rootDirectory2);

        FileSystemVisitor sizeVisitor = new SizeCalculatorVisitor();
        rootDirectory.accept(sizeVisitor);
        System.out.println("\n");
        FileSystemVisitor searchVisitor = new SearchVisitor();
        rootDirectory.accept(searchVisitor);
    }
}
