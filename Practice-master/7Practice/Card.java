public class Card {
    private int value;

    public Card(int value) { this.value = value; }
    public boolean canHit(Card c) {
        if (value == 0 && c.value == 9) { return true; }
        return value > c.value;
    }
}
