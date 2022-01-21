package Junittest;
// This is the Junit Test

		import static org.junit.Assert.*;

		import org.junit.Test;

		public class AlpacaTest {

			@Test
			
				public void talk() {
					//Reference: https://en.wikipedia.org/wiki/List_of_animal_sounds
				String cluck  = new String  ("cluck");
				assertEquals ("cluck",cluck.charAt(0));


			}

		}
/*fail the test*/