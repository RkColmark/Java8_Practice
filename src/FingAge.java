import java.time.LocalDate;
import java.time.Period;

public class FingAge {

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.parse("1997-03-27");
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate,currentDate);
        System.out.println(period.getYears());
    }
}
