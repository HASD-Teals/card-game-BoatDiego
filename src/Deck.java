import java.util.ArrayList;
import java.util.Random;

public class Deck {
    // PROPERTIES
    private Card[] defCard = new Card[52];
    private Card[] cards;

    // protected values for all default
    protected char[] rank = { '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };
    protected String[] Symbol = { "Clubs", "Diamonds", "Hearts", "Spades" };
    protected int[] value = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
    protected String[] Color = { "Green", "Blue", "Red", "Black" };

    // these are variables to store the custom value to ensure it goes smooth

    // CONSTRUCTORS
    public Deck() {

        this.cards = defDeck();
    }

    /**
     * declares ADVANCED custom deck object,
     * Leave without parameters if you want a default deck
     * 
     * @param numberOfCardsPerSuit
     * @param HighAce
     * @param hearts
     * @param spades
     * @param clubs
     * @param diamonds
     * @param HeartColor
     * @param Spadescolor
     * @param ClubsColor
     * @param DiamondsColor
     */
    public Deck(boolean HighAce, boolean hearts, boolean spades, boolean clubs,
            boolean diamonds, String HeartColor, String SpadesColor, String ClubsColor,
            String DiamondsColor) {
        String[] tempColor = { ClubsColor, DiamondsColor, HeartColor, SpadesColor };
        int[] tempValue = value;
        ArrayList suit = new ArrayList<String>();
        suit.add("Clubs");
        suit.add("Diamonds");
        suit.add("Hearts");
        suit.add("SpadesColor");
        if (HighAce == false) {
            tempValue[12] = 1;
        }
        int nums = 4;
        if (hearts == false) {
            nums--;
            suit.remove(2);
        }
        if (spades == false) {
            nums--;
            suit.remove(3);
        }
        if (clubs == false) {
            nums--;
            suit.remove(0);
        }
        if (diamonds == false) {
            nums--;
            suit.remove(1);
        }

        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < value.length; j++) {
                this.defCard[j].setRank(rank[j]);
                this.defCard[j].setValue(value[j]);
                this.defCard[j].playable(true);
                this.defCard[j].setSymbol(Symbol[i]);
                this.defCard[j].setColor(tempColor[i]);
            }
        }

    }

    // What teals wanted: Not that great
    /**
     * declares NORMAL custom deck object,
     * Leave without parameters if you want a default deck
     * 
     * @param numberOfCardsPerSuit
     * @param numberOfSuits
     * @param AceHigh
     */
    public Deck(int numberOfCardsPerSuit, int numberOfSuits, boolean AceHigh) {
        int[] tempValue = value;
        if (AceHigh == false) {
            tempValue[12] = 1;
        }
        for (int i = 0; i < numberOfSuits; i++) {
            for (int j = 0; j < numberOfCardsPerSuit; j++) {
                this.defCard[j].setRank(rank[j]);
                this.defCard[j].setValue(tempValue[j]);
                this.defCard[j].playable(true);
                this.defCard[j].setSymbol(Symbol[i]);
                this.defCard[j].setColor(Color[i]);
                if (j == value.length) {
                    j = 0;
                }
            }
        }

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
     * 26 red and black - in this suit, use green, blue, red, black
     * 4 suits - for loop start
     * 13 cards per suit - fill different suit when loop is over
     * king, queen, and jack are all value of 10 - if these values
     * ace is value of 1
     */

    private Card[] defDeck() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.defCard[j].setRank(rank[j]);
                this.defCard[j].setValue(value[j]);
                this.defCard[j].playable(true);
                this.defCard[j].setSymbol(Symbol[i]);
                this.defCard[j].setColor(Color[i]);
            }
        }
        return this.defCard;
    }

}
