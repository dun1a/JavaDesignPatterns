import Assignment.BasicPrinter;
import Assignment.EncryptedPrinter;
import Assignment.Printer;
import Assignment.XMLPrinter;

public class Main {

    public static void main(String[] args) {

        // using basic print
        Printer printer = new BasicPrinter();
        printer.print("Hello World");

        // using Assignment.XMLPrinter
        printer = new XMLPrinter(new BasicPrinter());
        printer.print("Hello World");

        printer = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer.print("Hello World");


    }

}
