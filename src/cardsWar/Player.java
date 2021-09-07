package cardsWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
  List<Card> hand;
  int score;
  String name;
  
  public Player(String name) {
	  this.hand = new ArrayList<Card>(26);
	  for (int value =1; value < 14; value++) {
		for (String suit : Card.suits) {
	        hand.add(new Card(suit, value));}
	            }
	  
	  this.score = 0;
	  this.name = name;
  }
  
  public void describe() {
	  System.out.println ("Name: "+ name + " Cards in hand: " + hand + " Score is: " + score);
	  for (Card card: hand) {
		  card.describe();
	  }
  }
	  public Card flip () {
		 hand.remove(hand.get(0));
		return hand.get(0);
	  }
	  
	  public void draw  (Deck deck ) {
		  	Card drwanCard = deck.draw();
			hand.add(drwanCard);	  
		  
		  
	  }
	  
	  public int incrementScore() {
		return score+=1;
		 
	  }
  }

