package גûאג;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class RaschetTest {

	@Test
	public void test() {
		Main k = new Main();
		String B = " dfgdggr ";
		int A = k.Result(B);
		if (A != 9)
			Assert.fail();
	}

}
