package codingAssignmentPkg;

public class AsteriskLogger implements Logger {

  @Override
  public void log(String info) {
    System.out.println("***" + info + "***");
  }


  
  @Override
  public void error(String error) {
    System.out.println("******************\r" +
                       "***Error: " + error + "***\r" +
                       "******************");
    
    
  }

}
