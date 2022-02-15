public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck One = new Deck();
        Deck Two = new Deck();
        One.shuffleCards();
        Two.shuffleCards();
    
        for (int i = 0; i < 52; i++) {
            Card one = One.getCardAt(i);
            Card two = Two.getCardAt(i);
        }

    }
}

