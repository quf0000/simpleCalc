import static org.junit.Assert.*;

import org.junit.Test;

public class Calulated {

	@Test
	public void test() {
		Calculation cal = new Calculation();
		int num = cal.add(1, 2);
		assertEquals(num, 3);
		
	}

}
