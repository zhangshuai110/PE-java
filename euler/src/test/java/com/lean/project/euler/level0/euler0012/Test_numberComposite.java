package com.lean.project.euler.level0.euler0012;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_numberComposite {
	@Test
	public void test_numberComposite() {
		Assert.assertEquals(Main1.numberComposite(1), 1);
		Assert.assertEquals(Main1.numberComposite(3), 2);
		Assert.assertEquals(Main1.numberComposite(6), 4);
		Assert.assertEquals(Main1.numberComposite(28), 6);
	}
}
