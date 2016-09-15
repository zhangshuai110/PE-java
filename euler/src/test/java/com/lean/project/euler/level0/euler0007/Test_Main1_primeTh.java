package com.lean.project.euler.level0.euler0007;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lean.project.euler.level0.euler0007.Main1;

public class Test_Main1_primeTh {
	@Test
	public void testPrimeTh() {
		Assert.assertEquals(Main1.primeTh(1), 2);
		Assert.assertEquals(Main1.primeTh(2), 3);
		Assert.assertEquals(Main1.primeTh(3), 5);
		Assert.assertEquals(Main1.primeTh(4), 7);
		Assert.assertEquals(Main1.primeTh(5), 11);
		Assert.assertEquals(Main1.primeTh(6), 13);
	}
}
