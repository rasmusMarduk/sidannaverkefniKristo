
package tictactoe

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {

	@Test
	public void should_set_and_get_value_in_grid() throws Exception {
			Player player1 = new Player();
			player1.setPlayerName("lalli");
			assertEquals("lalli");
			player1.setPlayerMarker("x");
			assertEquals("x");
	}
}
