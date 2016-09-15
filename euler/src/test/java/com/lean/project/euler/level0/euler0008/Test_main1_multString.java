package com.lean.project.euler.level0.euler0008;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_main1_multString {
	@Test
	public void test_multString0() {
		Assert.assertEquals(5832, Main1.multString("9989"));
		Assert.assertEquals(5832, Main1.multString("99891"));
		Assert.assertEquals(0, Main1.multString("09989"));
	}
}
