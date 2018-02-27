package solutions;

public class PrePostIncrement {

  public static void main(String[] args) {
    int count = 0;
    
    // Prints numbers from 1 to 9:
    // Increment happens before comparison for < 10, so when
    // count reaches 10 the loop exits before printing count.
//     while ( ( count = count + 1 ) < 10 ) {
    
    // Same as above
//     while ( ( count += 1 ) < 10 ) {
    
    // Post-increment: The value of count is taken and used in the
    // comparison BEFORE incrementing.
    // When count is 9, its value is compared for < 10; since it is,
    // the loop will be entered.  But immediately after the comparison
    // the ++ increments to 10, so this prints numbers from 1 to 10. 
//    while ( count++ < 10 ) {
    
    // Pre-increment: like the first two examples, increment happens
    // before comparison, so this prints numbers from 1 to 9.
    while ( ++count < 10 ) {
      System.out.println(count);
    }

  }

}
