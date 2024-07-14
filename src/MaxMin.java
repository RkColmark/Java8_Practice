import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,23,121,4545,213,52,1234,5,653);

        int max = integerList.stream().max(Comparator.naturalOrder() ).get();
        int min = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println(min);
    }
}
