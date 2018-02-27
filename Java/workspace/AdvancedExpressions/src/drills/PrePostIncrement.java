package drills;

public class PrePostIncrement {

  public static void main(String[] args) {
    int count = 0;
    
    while ( ( count = count + 1 ) < 10 ) {
      System.out.println(count);
    }

  }

}
