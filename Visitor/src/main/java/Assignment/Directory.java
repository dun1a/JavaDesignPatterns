package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{

    // because both File and Directory implement FileSystemElement interface,
    // we can use a list of FileSystemElement to store both files and subdirectories
    // it is like a tree structure (composite pattern)
    private List<FileSystemElement> files;
    private int size;

    public Directory(){
        this.files = new ArrayList<>();
    }

    public void addFile(FileSystemElement file){
        files.add(file);
    }
    public List<FileSystemElement> getFiles() {
        return files;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        // allows visitor to perform operation on this directory
        visitor.visit(this);
    }
}


