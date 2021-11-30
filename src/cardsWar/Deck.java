package cardsWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	private static String value;
	public List<Card> cards = new ArrayList<>();
	private final String[] ranks = {"2","3","4","5","6","7","8","9","10","jack","queen","king", "ace"};
	private final String[] suits = {"clubs","diamonds","hearts","spades"};

	public Deck() {
			for (int i=0; i<13; i++) {
				for (String suit: suits){	
					cards.add(new Card(ranks[i], suit, i+2));					
				}
		}		
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(0);

	}

}










/**
 &
 &&
 &&&
 &&&&
 &&&&&
 */


/**
   &
  &&&
 &&&&&
&&&&&&&
 */

/**
&&&&&&&
 &&&&&
  &&&
   &
 */
