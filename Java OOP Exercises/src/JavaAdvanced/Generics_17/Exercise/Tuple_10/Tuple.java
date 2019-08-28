package JavaAdvanced.Generics_17.Exercise.Tuple_10;

public class Tuple<A, B> {
    private A item1;
    private B item2;

    public Tuple(A item1, B item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public A getItem1() {
        return item1;
    }

    public B getItem2() {
        return item2;
    }

    @Override
    public String toString() {
        String result = this.item1 + " -> " + this.item2;
        return result.trim();
    }
}
