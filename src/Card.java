public class Card {
    // PROPERTIES
    private String color;
    private String Symbol;
    private char rank;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
        this.color = "";
        this.rank = ' ';
        this.Symbol = "";
        this.value = 0;
        this.playable = true;
    }
    /**
     * To declare a card object 
     * @param Color
     * @param rank
     * @param cardClass
     * @param value
     * @param playable
     */
    public Card(String Color, char rank, String cardClass, int value, boolean playable) {
        this.color = Color;
        this.rank = rank;
        this.Symbol = cardClass;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public String getSymbol() {
        return this.Symbol;
    }

    public char getRank() {
        return this.rank;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void playable(boolean playable) {
        this.playable = playable;
    }

    // METHODS
    public String toString() {
        String a = "Color: " + this.color + "\nSymbol: " + this.Symbol + "\nRank: "
                + this.rank + "\nvalue: " + this.value + "Playable: " + this.playable;
        return a;

    }

    public boolean isEqual(String color, String Symbol, char rank, int value, boolean playable) {
        boolean isEqual = false;
        if (this.color.equals(color) && (this.Symbol.equals(Symbol)
                && this.rank == rank && this.value == value && this.playable == playable)) {
            isEqual = true;
        }

        if (isEqual == true) {
            System.out.println("Both cards are equal");
        } else {
            System.out.println("Both cards are not equal");
        }
        return isEqual;
    }

}
