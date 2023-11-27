import java.util.ArrayList;
import java.util.Scanner;

public class TestOperations {

   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter 5 integer values:");

          for (int i = 0; i < 5; i++) {
             int number = scanner.nextInt();
             numbers.add(number);
           }
 
          System.out.println("Input -> " + numbers);

         ArrayListOperations.removeOddNumbers(new ArrayList<>(numbers));
         ArrayListOperations.doubleEvenNumbers(new ArrayList<>(numbers));
   }
}
