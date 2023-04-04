package codingAssignmentPkg;

public class App {

  public static void main(String[] args) {

    
    //creating instances of the Loggers for AsteriskLogger and SpacedLogger
    Logger asteriskLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();
    
    String input = "Hello";
    
    //calling the .log() method that the AsteriskLogger Class implements from Logger
    System.out.println("4) AsteriskLogger - Log Method: ");
    asteriskLogger.log(input);
    
    System.out.println("-----------------------------------------------");
    
    System.out.println("5) AsteriskLogger - Error Method: ");
    asteriskLogger.error(input);
    
    System.out.println("-----------------------------------------------");

    System.out.println("6) SpacedLogger - Log Method: ");
    spacedLogger.log(input);
    
    System.out.println("\r-----------------------------------------------");

    System.out.println("7) SpacedLogger - Error Method: ");
    spacedLogger.error(input);
    
    System.out.println("\r-----------------------------------------------");

  }

}
