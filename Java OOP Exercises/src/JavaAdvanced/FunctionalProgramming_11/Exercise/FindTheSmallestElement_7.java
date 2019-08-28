package JavaAdvanced.FunctionalProgramming_11.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                /* mapToInt() връща IntStream и трябва да използваме .boxed(), за да пакетира Stream-a в тип IntStream
                 * a когато използваме само .map, то ни връща Stream<Integer>, върху който можем да изпълняваме другите
                 * операции на stream, тоест да го collect-нем в списък например и не е нужно да използаваме .boxed()*/
                .collect(Collectors.toCollection(ArrayList::new));

        Function<ArrayList<Integer>, Integer> findIndexOfMin =
                (arr -> {
                    int min = arr.stream().min(Integer::compareTo).get();
                    return arr.lastIndexOf(min);
                });

        System.out.println(findIndexOfMin.apply(numbers));
    }
}
