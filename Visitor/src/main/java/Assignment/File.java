package Assignment;

public class File implements FileSystemElement{

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public String getName(){
        return name;
    }
}
