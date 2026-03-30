package Assignment;

// this class should traverse the file system and accumulate files that match a specific criterion
public class SearchVisitor implements FileSystemVisitor{
    @Override
    public void visit(File file) {
        if(file.getName().length() >= 5 && file.getName().length() <= 8){
                System.out.println("Found file with name between 5-8 characters: " + file.getName());
        }
    }
    @Override
    public void visit(Directory directory) {
        for(FileSystemElement d : directory.getFiles()){
            d.accept(this);
        }

    }
}
