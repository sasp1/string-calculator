import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

    public static void main(String[] args) {
        System.out.println("hey");
    }

    public int add(String numbers)
    {
        if (numbers.isEmpty())
            return 0;

        String delimiter = "[,\n]";
        if (numbers.contains("//")){
            int endDelimiterIdx = numbers.indexOf("\n");
            delimiter = numbers.substring(2, endDelimiterIdx);
            numbers = numbers.substring(endDelimiterIdx + 1);
        }
        String[] numbersArray = numbers.split(delimiter);

        int sum = 0;


        for (String s : numbersArray) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }


}
