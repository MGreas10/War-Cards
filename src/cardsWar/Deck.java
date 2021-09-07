package cardsWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public List<Card> cards;
	
	
	public Deck() {
		this.cards = new ArrayList<Card>(52);
			for (int value =1; value < 14; value++) {
			for (String suit : Card.suits) {
				cards.add(new Card(suit,value));				
		 }
		}
		
		}
	

	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public  Card draw () {
		return cards.remove(0);
			
		}
		
		
		 
	
}
