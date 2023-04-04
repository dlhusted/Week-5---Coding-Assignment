package codingAssignmentPkg;

public class SpacedLogger implements Logger{

  
  //iterates through the string and prints out each character followed by a space
  @Override
  public void log(String info) {
    for(int i = 0; i < info.length(); i++) {
      System.out.print(info.charAt(i) + " ");
    }
    
  }

  @Override
  public void error(String error) {
    System.out.print("ERROR: ");
    for(int i = 0; i < error.length(); i++) {
      System.out.print(error.charAt(i) + " ");
    }
    
  }

}
