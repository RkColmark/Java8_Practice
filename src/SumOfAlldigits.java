import java.util.stream.IntStream;

public class SumOfAlldigits {

    public static void main(String args[]){

        int number=23489;
         IntStream stream =String.valueOf(number).chars();

        int sum = stream.map(Character::getNumericValue).sum();

        System.out.println(sum);
    }
}
