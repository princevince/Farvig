
public class KaartOpMaat {

		public void makeKaartOpMaat() {
			
		Size sizeObject = new Size();
		sizeObject.cardSize();

		Background bgcolorObject = new Background();
		bgcolorObject.chooseColor();
		
		Lettertype typeObject = new Lettertype();
		typeObject.chooseTypeLt();
		
		Lettertype colorObj = new Lettertype();
		colorObj.chooseColorLt();
		
		Lettertype sizeObj = new Lettertype();
		sizeObj.chooseSizeLt();
		
		Text typObj = new Text();
		typObj.inputText();
	}

}
