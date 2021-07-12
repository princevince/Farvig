import java.util.Scanner;

public class Background {
	private String bgColor;
	
	public void chooseColor() {
		System.out.println("De achtergrond van de kaart kan gedrukt worden met deze 1 van deze kleuren: ");
		System.out.println("Groen, Geel, Rood, Blauw, Bruin, Zwart, Wit.");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welke kleur wil je als achtergrondkleur van je kaart?");
		String answer = keyboard.nextLine();
		answer = answer.toString();
		
	}
}
		



	
