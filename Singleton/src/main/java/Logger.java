import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance; // Static variable to hold the single instance of Logger

    private FileWriter fileWriter;

    private String fileName;

    private Logger(){
        this.fileName = "log.txt";
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public synchronized void writeLog(String message){
        try{
            fileWriter.write(message + "\n");
            System.out.println("Log written: " + message);
        }catch(IOException e){
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }

    public synchronized void setFileName(String fileName){
        this.fileName = fileName;
        try {
            fileWriter = new FileWriter(fileName);
            System.out.println("Log file name set to: " + fileName);
        }catch(IOException e){
            System.out.println("Error setting log file name: " + e.getMessage());
        }
    }

    public synchronized void closeLog(){
        try{
            if(fileWriter != null){
                fileWriter.close();
                System.out.println("Log file closed.");
            }
        }catch(IOException e){
            System.out.println("Error closing log file: " + e.getMessage());
        }
    }

    public static void main(String[] args){

        Logger logger = Logger.getInstance();
        logger.setFileName("another_log.txt");
        logger.writeLog("Simulation testing 2!");
        logger.writeLog("Processing data...");
        logger.writeLog("Simulation 2 done!");
        logger.closeLog();

    }
}

