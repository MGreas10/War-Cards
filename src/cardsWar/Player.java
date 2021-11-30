package cardsWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;

	public Player(String name) {
		setName(name);
		setHand(hand);
		setScore(score);

	}

	public void describe() {
		System.out.println("Name: " + name + " Cards in hand: " + hand + " Score is: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		Card drwanCard = deck.draw();
		hand.add(drwanCard);
	}

	public int incrementScore() {
		return score += 1;
	}

	// getters setters
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
