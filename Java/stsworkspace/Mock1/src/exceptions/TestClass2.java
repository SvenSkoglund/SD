//"Which of the lines will cause a compile time error in the following program?
public class TestClass2{
   public static void main(String args[]){
      char c;
      int i;
      c = 'a';//1
      i = c;  //2
      i++;    //3
      c = i;  //4
      c++;    //5
   }
}