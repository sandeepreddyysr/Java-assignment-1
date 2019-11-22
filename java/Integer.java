package omniwyse.SandeepReddy1;

import org.junit.Test;
import org.junit.Assert;

public class Integer {

	/**
	 * This class is used to get the power the given number
	 */
	public static int numberPower(int number, int power) {
		if (power == 0) {
			return 1;
		}
		return number * numberPower(number, power - 1);
	}

	@Test
	public void calculatePower() {
		Assert.assertEquals(16, numberPower(2, 4));
	}

	@Test
	public void calculateWrongPower() {
		Assert.assertNotEquals(16, numberPower(2, 6));
	}
}
