package dev.jefftrue.blackjack;

public class Main {
    public static void main(String[] args) {

        // try the no-argument constructor
//        Card aceSpades = new Card();
//        System.out.println(aceSpades);

        // Try the 2 argument constructor
//        Card sevenSpades = new Card(Face.SEVEN, Suit.SPADES);
//        Card jackClubs = new Card(Face.JACK, Suit.CLUBS);
//
//        System.out.println(sevenSpades);
//        System.out.println(jackClubs);

        // try the 4 argument constructor
//        Card eightHearts = new Card(Face.EIGHT, Suit.HEARTS, 8, false);
//        Card tenClubs = new Card(Face.TEN, Suit.CLUBS, 10, true);
//
//        System.out.println(eightHearts);

        // print the ten of clubs
//        System.out.println(tenClubs);
//        tenClubs.setTurnedUp(false); //turn over the ten of clubs
//        System.out.println(tenClubs);
//        tenClubs.setValue(11); // give this card more value
//        System.out.println(tenClubs);
//        Deck deck = new Deck();
//        System.out.println(deck);
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("This is the shuffled Deck");
        System.out.println(deck);

        Hand hand = new Hand();
        System.out.println("The empty Hand:");
        System.out.println(hand);
        hand.addCard(deck.deal());
        System.out.println("After one card is dealt");
        System.out.println(hand);
        hand.addCard(deck.deal());
        System.out.println("After two cards are dealt");
        System.out.println(hand);

        System.out.println("The deck after two cards are dealt");
        System.out.println(deck);
    }
}