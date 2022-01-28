import javax.sound.sampled.BooleanControl;

public class Deck {
    // PROPERTIES
    private Card[] defCard = new Card[52];
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {

        this.cards = this.defCard;
    }

    /**
     * declares custom deck object
     * 
     * @param numberOfCardsPerSuit
     * @param HighAce
     * @param hearts
     * @param spades
     * @param cloves
     * @param diamonds
     */
    public Deck(int numberOfCardsPerSuit, boolean HighAce, boolean hearts, boolean spades, boolean cloves,
            boolean diamonds) {

    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }
    /*
     * 52 cards - final amount of cards in the default array
     * 26 red and black - if this suit, use black or red
     * 4 suits - for loop start
     * 13 cards per suit - fill different suit when loop is over
     * king, queen, and jack are all value of 10 - if these values
     * ace is value of 1
     */

    public Card[] defDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {

            }
        }

    }

}
