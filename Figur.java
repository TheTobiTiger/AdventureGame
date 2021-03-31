
public class Figur {

	private int skillpunkte;
	private String element;
	private String eigenschaft;
	private int atk;
	private int hp;
	private int def;
	private int magie;
	private int schild = 2;
	
	public Figur() {
		
	}
	
	public Figur(int atk, int hp, int def, int magie) {
		this.atk = atk;
		this.hp = hp;
		this.def = def;
		this.magie = magie;
		
		
	}
	
	public void laufen() {
		
	}
	
	public int angreifen(Figur charakter, Figur gegner) {
		gegner.hp -= charakter.atk;
		System.out.println("Gegnerische Leben: " + gegner.hp);
		return gegner.hp;
		
	}
	
	public void blocken() {
		switch(schild) {
		case 2: 
			System.out.println("Angriff erfolgreich abgewehrt!");
			this.schild -=1;
			System.out.println(schild + " Schild übrig \n");
			break;
		case 1:
			System.out.println("Angriff erfolgreich abgewehrt!");
			this.schild -=1;
			System.out.println(schild + " Schilde übrig\n");
			break;
		case 0:
			System.out.println("Du hast keine Schilde mehr übrig!\n");
			break;
			
	}
				
	}
	
	public int angreifenMagie(Figur charakter, Figur gegner) {
		
	}
	
	public void flüchten() {
		
	}
	
	public void aufsammeln() {
		
	}
}
