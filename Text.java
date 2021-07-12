
import java.util.Scanner;

public class Text {
		private String Text;
		
		public void inputText() {		
			System.out.println("In dit vak kun je de tekst typen die je wilt afdrukken op de voorkant van de kaart: ");
			System.out.println("Tip: houd rekening met de grootte van je lettertype. Hoe groter je lettertype hoe minder tekst je kunt plaatsen op de kaart.");
			
			Scanner keyboard = new Scanner(System.in);
			String answer = keyboard.nextLine();
			answer = answer.toString();
			
		}
				
}
