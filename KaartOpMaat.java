
public class KaartOpMaat {
	// Je kunt je objecten hier lokaal bewaren.
	private Size sizeObject;
	private Background bgColorObject;
	private Lettertype ltObject;
	private Text textObject;

	// Hier initialiseer je de kaart.
	public void makeKaartOpMaat() {			
		sizeObject = new Size();
		sizeObject.chooseCardSize();

		bgColorObject = new Background();
		bgColorObject.chooseColor();
		
		ltObject = new Lettertype();
		ltObject.chooseTypeLt();
		ltObject.chooseColorLt();
		ltObject.chooseSizeLt();
		
		textObject = new Text();
		textObject.inputText();
	}

	// En hier zou je de beschrijving kunnen opvragen
	public String kaartBeschrijving() {
		return "Deze kaart heeft de volgende specificaties:\n" +
			"Size: " + sizeObject.getCardSize() + "\n" +
			"Background color: " + bgColorObject.getColor() + "\n" +
			"etc...";
	}
}
