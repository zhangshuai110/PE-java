package com.lean.project.euler.euler0006;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Main1_SumSquare {
	@Test
	public void squareSum0() {
		long num = 0;
		long ex = 0;
		long r = Main1.sumSquare(num);
		Assert.assertEquals(r, ex);
	}
	@Test
	public void squareSum10() {
		long num = 10;
		long ex = 3025;
		long r = Main1.sumSquare(num);
		Assert.assertEquals(r, ex);
	}
}
