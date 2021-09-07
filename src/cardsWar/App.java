package cardsWar;

public class App {

	public static void main(String[] args) {
		
		
		Deck deck = new Deck();
		Player player1 = new Player("Sally");
		Player player2 = new Player("Mario");
		
		deck.shuffle();
		
		
	
		for (int i =0; i <52; i++) {
			player2.draw(deck);
			
		}
		
		
		for (int i =0; i<26; i++) {
			 player1.flip();
			 player2.flip();
			 
		
		}
	

		
		
		

	}
	
	
}
