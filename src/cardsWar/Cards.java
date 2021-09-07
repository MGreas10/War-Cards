package cardsWar;

public class Cards {
 private String name;
 private int value;
 
 public Cards(String name, String suit) {
	 setName(String name);
	 setSuit(String suit);
 }
 
 public void setName(String name) {
	 name = name.toLowerCase();
	 this.name = name;
 }
 
 public String getName() {
		return name;
	}
 
 
 
}
