package Assignment;

public class SizeCalculatorVisitor implements FileSystemVisitor{

    int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
        System.out.println("File size: " + file.getSize());
    }

    @Override
    public void visit(Directory directory) {
        for(FileSystemElement d : directory.getFiles()){
            d.accept(this);
        }
        // we don't need to do anything here because the size of a directory is determined by the size of its files and subdirectories
        System.out.println("Directory size: " + totalSize);

    }
}
