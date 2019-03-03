package JavaOOP.WorkingWithAbstractions_3.Exercise.CardsWithPower_3;

public class Card {
    private Deck name;
    private Rank suit;

    public Card(Deck name, Rank suit) {
        this.name = name;
        this.suit = suit;
    }

    public int calculatePower() {

        return this.name.getValue() + this.suit.getValue();
    }
    @Override
    public String toString() {
        return String.format(
                "Card name: %s of %s; Card power: %d",
                this.name,
                this.suit,
                calculatePower());
    }
}
