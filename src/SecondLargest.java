import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SecondLargest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(12,323,432,544,336,122,757,855,367,54);

        int secondLargest = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secondLargest);
    }
}