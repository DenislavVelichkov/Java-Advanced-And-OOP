package JavaOOP.WorkingWithAbstractions_3.Exercise.CardsWithPower_3;

public class Card {
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public int calculatePower() {

        return Deck.valueOf(this.name).getValue() +
               Rank.valueOf(this.suit).getValue();
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
