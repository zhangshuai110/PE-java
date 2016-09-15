package com.lean.project.euler.euler0006;

import org.testng.annotations.Test;

import com.lean.project.euler.euler0006.Main1;

import junit.framework.Assert;

public class Test_Main1_SumSquare {
	@Test
	public void testSquareSum0() {
		long num = 0;
		long ex = 0;
		long r = Main1.squareSum(num);
		Assert.assertEquals(ex, r);
	}

	@Test
	public void testSquareSum10() {
		long num = 10;
		long ex = 385;
		long r = Main1.squareSum(num);
		Assert.assertEquals(ex, r);
	}
}
