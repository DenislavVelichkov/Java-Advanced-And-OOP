package JavaAdvanced.Generics_17.JarOfT_1;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add(T entity) {
        this.content.push(entity);
    }

    public T remove() {
        return this.content.pop();
    }
}
