package cardsWar;

public class Card {
	private int value;
	private String name;

	
	private static final String[] ranks = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
	public static final String[] suits = {"clubs","diamonds","hearts","spades"};
	
	public Card(String name, int value) {
		setName(name);
		setValue(value);
		
	}
	 
	public void describe() {
//		
		 System.out.println( "Card's name: " + name + ", " + "Card's value: " + value);
		
	 }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value >=1 && value <=13) {
			if(name.toLowerCase().contains("ace")) {
				this.value = 1;
			}else if (name.toLowerCase().contains("jack")) {
				this.value =11;
			} else if (name.toLowerCase().contains("queen")) {
				this.value =12;
			}else if (name.toLowerCase().contains("King")) {
				this.value =13;
			} else { this.value = value;}
		} 
		
				
		}
		
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
			for (String rank : ranks) {
				for (String suit : suits) {
					if (name.toLowerCase().contains(rank) || name.toLowerCase().contains(suit)) {
						this.name = name;
					}
			
				} 
			}
			
			
			
	}
	

	
	
}
