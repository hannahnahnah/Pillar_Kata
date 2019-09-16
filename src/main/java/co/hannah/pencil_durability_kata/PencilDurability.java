package co.hannah.pencil_durability_kata;

public class PencilDurability {
	
	/* ---WRITE--- */
	//create pencil
	//create paper
	private static StringBuilder paper = new StringBuilder("");
	
	//write strings to paper... append previous strings
	public static String write(String string) {
		String written = paper.append(string).toString();
		return written;
	}
	
	
	/* ---POINT DEGRADATION--- */
	//create pencil's durability value. higher value = more characters written before dull
	//each character degrades pencil point. lowercase degrades by 1, capital degrades by 2
	public static String degrade(String string) {
		int pencilDurability = 5;
		char[] charArray = string.toCharArray();
		for (char eachChar : charArray) {
			if (Character.isLowerCase(eachChar)) {
				--pencilDurability;
			} else if (Character.isUpperCase(eachChar)) {
				--pencilDurability;
				--pencilDurability;
			}
		}
		return String.valueOf(pencilDurability);
	}
	
	
	
	//a dull pencil writes spaces for intended characters
	
	/* ---SHARPEN--- */
	//sharpening a pencil restores its original durability value
	//create pencil's length value
	//a pencil loses one length value with each sharpening
	//when the pencil's length value reaches 0, sharpening no longer restores the durability value
	
	/* ---ERASE--- */
	//create erase. remove last occurrence of that text from the paper
	//if erase called again, it removes the next previous occurrence
	
	/* ---ERASER DEGRADATION--- */
	//create eraser with a set durability value
	//all characters degrade the eraser durability value by one
	//whitespace does not degrade the eraser
	//text erases in reverse order from how it was written
	//when an eraser's durability value reaches zero, it no longer erases
	
	/* ---EDITING--- */
	//erasing creates whitespace in a string of text
	//whitespace may be rewritten over by text, but only that which fits into the existing whitespace
	//if text to be written is more characters than whitespace existing, replace overwritten characters with an @
	
	

}
