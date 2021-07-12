import java.util.ArrayList;
import java.util.Scanner;

public class Lettertype {

//private String typeLettertype;
//private String sizeLettertype;
//private String colorLettertype;

	public void chooseTypeLt() {
		System.out.println("Er zijn een aantal lettertypes beschikbaar waar je uit kunt kiezen.");
		System.out.println("Dat zijn deze: ");
		
		ArrayList<String>lettertypeList = new ArrayList();
		lettertypeList.add("Arial");
		lettertypeList.add("Tahoma");
		lettertypeList.add("STENCIL STD");
		lettertypeList.add("Rock Out");
		lettertypeList.add("Great Wishes");
		
		System.out.println(lettertypeList);
			
		System.out.println("Welk lettertype kies je?");
		
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.nextLine();
		answer = answer.toString();
	}
	
	public void chooseColorLt() {
		System.out.println("Maak uit de volgende kleuren een keuze voor je lettertype:");
		
		ArrayList<String>colorList = new ArrayList();
		colorList.add("Blauw");
		colorList.add("Zwart");
		colorList.add("Rood");
		colorList.add("Wit");
		colorList.add("Geel");
		colorList.add("Groen");
		
		System.out.println(colorList);
		
		System.out.println("Welke kleur kies je voor je lettertype?");
		
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.nextLine();
		answer = answer.toString();
	}
	
	public void chooseSizeLt() {
		System.out.println("Nog 1 keuze te maken voor het lettertype: de grootte.");
		System.out.println("Dit zijn de keuzes:");
		
		ArrayList<String>sizeList = new ArrayList();
		sizeList.add("10 pt = Small (S)");
		sizeList.add("14 pt = Medium (M)");
		sizeList.add("20 pt = Large (L)");
		sizeList.add("30 pt = Extra Large (XL)");
		
		System.out.println(sizeList);
		
		System.out.println("Maak je keuze en typ de bijbehorende letter: S, M, L of XL.");
		
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.nextLine();
		answer = answer.toString();
	}
}
