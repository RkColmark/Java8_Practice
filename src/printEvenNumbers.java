import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printEvenNumbers {

    public static void main(String args[]){

        List<Integer> intergerList = Arrays.asList(12,24,56,7,9,35,57,80,46,22,67,73);

        //1st
        List<Integer> evenList = intergerList.stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println("1st method" + evenList);

        //2nd
        intergerList.forEach(e -> {

            if(e%2 ==0)
            {
                System.out.println(e);
            }
        });

        //3rd
        intergerList.stream().filter(e -> e%2 ==0).forEach(e ->{

                    System.out.println(e);
                }
        );

    }
}
