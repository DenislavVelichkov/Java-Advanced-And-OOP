package JavaOOP.WorkingWithAbstractions_3.Exercise.CardsWithPower_3;

public enum Rank {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
