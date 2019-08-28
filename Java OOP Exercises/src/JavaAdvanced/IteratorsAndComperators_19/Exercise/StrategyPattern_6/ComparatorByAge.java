package JavaAdvanced.IteratorsAndComperators_19.Exercise.StrategyPattern_6;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}
