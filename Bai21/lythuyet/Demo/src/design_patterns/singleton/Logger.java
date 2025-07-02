package design_patterns;

import java.time.LocalDateTime;
//Singleton Design Pattern
public class Logger {
    private static Logger instance; //null
    private String fileName = "";
    private Logger(){
        this.fileName = LocalDateTime.now() + ".txt";
    }
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String log) {
        System.out.println(">>>" + this.fileName);
    }
}
