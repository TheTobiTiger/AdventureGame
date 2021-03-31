import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Figur figur = new Figur();
		Figur charakter = new Figur(24, 100, 5,0);
		Figur gegner1 = new Figur(12, 50, 5, 0 );
		int aktion;
		
		auswaehlenAktion(aktion);
		ausfuehrenAktion(aktion, charakter, gegner1);
		
		
		
		
		
		
		
	}
	
	public static int auswaehlenAktion(int aktion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wählen Sie eine Aktion aus:");
		aktion = sc.nextInt();
		return aktion;
	}
	
	public static void ausfuehrenAktion(int aktion, Figur charakter, Figur gegner) {
		switch(aktion) {
		case 1:
			charakter.angreifen(charakter, gegner);
			break;
		case 2:
			charakter.blocken();
			break;
		}
	}
	

}
