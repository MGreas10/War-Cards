package cardsWar;

public class App {

	public static void main(String[] args) {
	
		Deck deck = new Deck();
		Player player1 = new Player("Sally");
		Player player2 = new Player("Mario");
		
		deck.shuffle();

		for (int i =0; i <26; i++) {
			player1.draw(deck);
			player2.draw(deck);	
		}
		
		
		for (int i =0; i<26; i++) {
			 Card card1 = player1.flip();
			 Card card2 = player2.flip();
			 
			 if (card1.getValue() > card2.getValue()) {
				 player1.incrementScore();
			 } else if (card1.getValue() < card2.getValue()) {
				 player2.incrementScore();
			 }
			 	 
		
		}
		
		if (player1.getScore()> player2.getScore()) {
			System.out.println(player1.getName() + " wins the game");
		}else if (player1.getScore()< player2.getScore()) {
			System.out.println(player2.getName() + " wins the game");
		}else {
			System.out.println("Game over no one wins");
		}
	
//	
	}
	}
