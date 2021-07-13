import java.util.Scanner;

public class Size {
	// Als je de gekozen cardsize hier opslaat, kan je hem later opvragen.
	private int chosenCardSize;

	public void chooseCardSize() {
		System.out.println("De kaart kan gedrukt worden op 2 formaten:");
	
	   String format[]= new String[2];
	   format[0]="Vierkant";
	   format[1]="Briefkaart";
	   	    	    
	   System.out.print("Keuze 1: "); 
	   System.out.println(format[0]);
	   
	   System.out.print("Keuze 2: ");
	   System.out.println(format[1]);

	   Scanner myObj = new Scanner(System.in);
	   System.out.println("Typ je keuze in: 1 of 2.");

		// Klant geeft nummer van keuze in
		chosenCardSize = myObj.nextInt();
	    
		// Output wat de klant heeft ingevoerd
	    System.out.println("Kaartformaat: jouw keuze is " + String.valueOf(chosenCardSize));
	}

	// Hiermee kan je de gekozen card size opvragen
	public int getCardSize() {
		return chosenCardSize;
	}
}
