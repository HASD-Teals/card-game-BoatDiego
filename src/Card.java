public class Card {
    // PROPERTIES
    private String color;
    private char rank;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
        this.color = "";
        this.rank = ' ';
        this.value = 0;
        this.playable = true;
    }

    public Card(String Color, char rank, int value, boolean playable) {
        this.color = Color;
        this.rank = rank;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public char getRank() {
        return this.rank;
    }
    public int getValue(){
        return this.value;
    }
    public boolean isPlayable(){
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }
    public void value (int value){
        this.value = value;
    }
    public void playable(boolean playable){
        this.playable =playable;
    }

    // METHODS
    public void toString 


}
