package co.hannah.pencil_durability_kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class PencilDurabilityTest {
	
	@Test
	public void pencilWritesStringToPaper() {
		String actual = PencilDurability.write("She sells sea shells");
		String expected = "She sells sea shells";
		assertEquals(expected, actual);
	}
	
	@Test
	public void secondStringWrittenAppendsFirstString() {
		String actual = PencilDurability.write(" down by the seashore");
		String expected = "She sells sea shells down by the seashore";
		assertEquals(expected, actual);
	}
	
	@Test
	public void pencilPointDegradesByOneWhenLowerCaseLettersAreWritten() {
		String actual = PencilDurability.degrade("text");
		String expected = "1";
		assertEquals(expected, actual);
	}

}