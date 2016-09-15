package com.lean.project.euler.euler0009;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_checkTripet {
	@Test
	public void testCheckTripet() {
		Assert.assertEquals(true, Main1.checkTripet(3, 4, 5));
		Assert.assertEquals(false, Main1.checkTripet(1, 2, 3));
		Assert.assertEquals(false, Main1.checkTripet(4, 3, 5));
	}
}
