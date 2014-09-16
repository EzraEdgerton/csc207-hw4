import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testSplitAt() {
		assertArrayEquals(new String[] { "a", "b", "c" },
				StringUtil.splitAt("a:b:c", ':'));
		assertArrayEquals(new String[] { "a", "b", "c" },
				StringUtil.splitAt("a b c", ' '));
		assertArrayEquals(new String[] { "a:b:c" },
				StringUtil.splitAt("a:b:c", ' '));
		assertArrayEquals("one field", new String[] { "a" },
				StringUtil.splitAt("a", ':'));
		assertArrayEquals("empty inner field", new String[] { "a", "", "c" },
				StringUtil.splitAt("a::c", ':'));
		assertArrayEquals("leading empty field", new String[] { "", "a" },
				StringUtil.splitAt(":a", ':'));
		assertArrayEquals("trailing empty field", new String[] { "a", "" },
				StringUtil.splitAt("a:", ':'));
	}
/*  WHERE IS IT?
	@Test
	public void testSplitCSV() {
		assertArrayEquals(new String[] { "a", "b", "c" },
				StringUtil.splitCSV("a,b,c"));
		assertArrayEquals(new String[] { "a,b", "c" },
				StringUtil.splitCSV("\"a,b\",c"));
		assertArrayEquals(new String[] { "a", "b,b\"", "c" },
				StringUtil.splitCSV("a,\"b,b\"\"\",c"));
		assertArrayEquals(new String[] { "a", "b\"b", "c" },
				StringUtil.splitCSV("a,\"b\"\"b\",c"));
	}*/

}
