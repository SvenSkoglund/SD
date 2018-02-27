package solutions;

public class RandomString {

  public static void main(String[] args) {
    String[] animals = {
        "Cat", "Dog", "Frog", "Giraffe", "Wombat",
        "Lion", "Elephant", "Pangolin", "Coati", "Newt",
        "Capybara", "Sloth", "Fishing Cat", "Marmoset"
    };
    
    for (int i=0; i<10; i++) {
      int index = (int)(Math.random() * animals.length);
      System.out.println(animals[index]);
    }
  }

}
