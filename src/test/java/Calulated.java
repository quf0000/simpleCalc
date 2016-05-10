import static org.junit.Assert.*;

import org.junit.Test;

public class Calulated {

	@Test
	public void test() {
		Calculation cal = new Calculation();
		int num = cal.add(1, 2);
		int n = cal.sub(5, 1);
		assertEquals(num, 3);
		assertEquals(n, 4);
		
	}

}
