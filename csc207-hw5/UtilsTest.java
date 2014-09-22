import static org.junit.Assert.*;

import org.junit.Test;


public class UtilsTest {

	@Test
	public void testExpt() {
		assertEquals(1024, Utils.expt(2,10));
	}

}
