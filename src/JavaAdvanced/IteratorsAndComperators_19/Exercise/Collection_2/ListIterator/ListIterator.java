package JavaAdvanced.IteratorsAndComperators_19.Exercise.Collection_2.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<String> {
    private static final int INIT_INDEX = -1;

    private List<String> data;
    private int index;

    public ListIterator(ArrayList<String> data) {
        this.data = data;
        this.setIndex();
    }

    private void setIndex() {
        if (this.data.size() == 0) {
            this.index = INIT_INDEX;
        } else {
            this.index = 0;
        }
    }



    public String print() {
        if (this.data.size() == 0) {
            throw new IndexOutOfBoundsException("Invalid Operation!");
        }

        return this.data.get(this.index);
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return index < data.size() - 1;
            }

            @Override
            public String next() {
                if (index < data.size() - 1) {
                    return data.get(index++);
                } else {
                    return data.get(index);
                }
            }
        };
    }
}
