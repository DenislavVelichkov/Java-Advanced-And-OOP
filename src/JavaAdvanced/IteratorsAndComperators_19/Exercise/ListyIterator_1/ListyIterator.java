package JavaAdvanced.IteratorsAndComperators_19.Exercise.ListyIterator_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private static final int INIT_INDEX = -1;
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
    public Iterator<String> iterator() {
        return new Iterator<>() {
            int index = INIT_INDEX;

            @Override
            public boolean hasNext() {
                return index < data.size();
            }

            @Override
            public String next() {
                if (data.isEmpty()) {
                    System.out.println("Invalid Operation!");
                }

                return data.get(index++);
            }
        };
    }
}
