import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountCharactersInString {

    public static void main(String[] args) {


        String input = "testfrequecnyofCHaracters";

        IntStream stream = input.chars();

        Stream<Character> characterStream = stream.mapToObj(c -> (char) c);

        Map<Character, Long> characterLongMap = characterStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(characterLongMap);

    }
}
