package JavaAdvanced.IteratorsAndComperators_19.Exercise.StrategyPattern_6;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int result = firstPerson.getName().length() - secondPerson.getName().length();

        if (result == 0) {
            result =
                    firstPerson.getName().toLowerCase().charAt(0) - secondPerson.getName().toLowerCase().charAt(0);
        }

        return result;
    }
}
