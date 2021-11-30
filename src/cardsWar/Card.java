package cardsWar;

public class Card {

	private int value;
	private String suit;
	private String rank;
	
	public Card(String rank, String suit, int value) {
		setValue(value);
		setSuit(suit);
		setRank(rank);
	}

	public void describe() {
		System.out.println("Card's name: " + rank + "of" + suit + ", " + "Card's value: " + value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;

	}

	public void setSuit(String suit) {
			this.suit = suit;
			}
	
	public String getSuit() {
		return suit;
	}
		

	public void setRank(String rank) {
			this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}


}
