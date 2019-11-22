package omniwyse.SandeepReddy1;

import org.junit.Assert;
import org.junit.Test;

/**
 * This test is used to get the given String permutations. Time Complexity:
 * O(n!)
 * 
 * @author Sandeep Reddy
 *
 */

public class TestStringPermutations {

	@Test
	public void PermutationTest() {
		Assert.assertEquals(6, permutation.stringPermutation("", "JSP"));
	}

}