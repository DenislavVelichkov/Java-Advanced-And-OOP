package JavaOOP.Inheritance_7.RandomArrayList_5;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private Random random;

    public RandomArrayList() {
        this.random = new Random();
    }

    public Object getRandomElement() {
        int index = this.random.nextInt(super.size() - 1);
        Object element = super.get(index);
        super.remove(index);

        return element;
    }
}