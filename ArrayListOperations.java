import java.util.ArrayList;

public class ArrayListOperations {
    public static void removeOddNumbers(ArrayList<Integer> numbers) {
         numbers.removeIf(n -> n % 2 != 0);
         System.out.println("Output -> " + numbers);
    }
  
    public static void doubleEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
               int doubledNum = num * 2;
               newNumbers.add(doubledNum);
            }
        }
        System.out.println("Output -> " + newNumbers);
     }
}
