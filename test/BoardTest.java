
package tictactoe

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {

	@Test
	public void should_set_and_get_value_in_grid() throws Exception {
		Board board1 = new Board();
		assertEquals("1");
		assertEquals("2");
		assertEquals("3");
		assertEquals("4");
		assertEquals("5");
		assertEquals("6");
		assertEquals("7");
		assertEquals("8");
		assertEquals("9");
	}
}
