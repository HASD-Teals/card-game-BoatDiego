import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.LinkedHashSet;
//import java.util.Random;
//import java.util.Set;

public class Deck {
    // PROPERTIES
    private Card[] defCard = new Card[52];
    private Card[] cards;
    private ArrayList<Card> secCards = new ArrayList<Card>();
    // protected values for all default
    protected char[] rank = { '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };
    protected String[] Symbol = { "Clubs", "Diamonds", "Hearts", "Spades" };
    protected int[] value = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
    protected String[] Color = { "Green", "Blue", "Red", "Black" };

    // these are variables to store the custom value to ensure it goes smooth
    public Deck() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.defCard[j] = new Card(Color[i], rank[j], Symbol[i], value[j], true);
                /**
                 * The setters below will not work because while defCard is set as an array of
                 * Cards with a lenght of 52, each item is null. Instead, use the constructor to
                 * set the values (see line 24).
                 */
                // this.defCard[j].setRank(rank[j]);
                // this.defCard[j].setValue(value[j]);
                // this.defCard[j].playable(true);
                // this.defCard[j].setSymbol(Symbol[i]);
                // this.defCard[j].setColor(Color[i]);
            }
        }
        /**
         * This defCard length is 52, but only the first 13 cards are not null. The
         * remaining 39 cards need to be set
         */
        for (int k = 0; k < defCard.length; k++) {
            secCards.add(defCard[k]);
        }

    }

    /*
     * // CONSTRUCTORS
     * public Deck() {
     * 
     * for (int i = 0; i < 4; i++) {
     * for (int j = 0; j < 13; j++) {
     * this.defCard[j].setRank(rank[j]);
     * this.defCard[j].setValue(value[j]);
     * this.defCard[j].playable(true);
     * this.defCard[j].setSymbol(Symbol[i]);
     * this.defCard[j].setColor(Color[i]);
     * }
     * }
     * 
     * }
     */
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
        ArrayList<Object> suit = new ArrayList<Object>();
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

    public Card getCardAt(int position) {
        return this.cards[position];
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
        // Random nums = new Random();
        // Set<Integer>set = new LinkedHashSet<Integer>();
        Collections.shuffle(Arrays.asList(this.cards));
        // for (int i = 0; i < cards.length; i++) {
        // this.cards[i] = cardi[nums.nextInt(cards.length)];
        // }
    }
    /*
     * 52 cards - final amount of cards in the default array
     * 26 red and black - in this suit, use green, blue, red, black
     * 4 suits - for loop start
     * 13 cards per suit - fill different suit when loop is over
     * king, queen, and jack are all value of 10 - if these values
     * ace is value of 1
     */
    /*
     * private Card[] defDeck() {
     * 
     * for (int i = 0; i < 4; i++) {
     * for (int j = 0; j < 13; j++) {
     * this.defCard[j].setRank(rank[j]);
     * this.defCard[j].setValue(value[j]);
     * this.defCard[j].playable(true);
     * this.defCard[j].setSymbol(Symbol[i]);
     * this.defCard[j].setColor(Color[i]);
     * }
     * }
     * return this.defCard;
     * }
     */
}
