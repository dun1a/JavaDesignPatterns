package Assignment;

public class XMLPrinter extends PrintDecorator{

    public XMLPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String message){
        super.print("<message>" + message +  "</message>");
    }
}
