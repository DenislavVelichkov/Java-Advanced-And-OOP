package JavaAdvanced.IteratorsAndComperators_19.Exercise.ListyIterator_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<T> {
    private static final int INDEX = -1;
    private List<String> data;
    private int index;


    public ListyIterator() {
        this.data = new ArrayList<>();
    }

    public ListyIterator(List<String> data) {
        this.data = data;
    }

    public List<String> getCollection() {
        return this.data;
    }

    public void add(String element) {
        this.data.add(element);
    }


    @Override
    public Iterator<> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < collection.size();
            }

            @Override
            public T next() {
                if (collection.isEmpty()) {
                    System.out.println("Invalid Operation!");
                }

                return collection.get(index++);
            }
        };
    }
}
