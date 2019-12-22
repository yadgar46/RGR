package גûאג;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class RaschetTest {

	@Test
	public void test() {
		Main k = new Main();
		String B = " dfgdggrh ";
		int A = k.Result(B);
		if (A != 8)
			Assert.fail();
	}

}
