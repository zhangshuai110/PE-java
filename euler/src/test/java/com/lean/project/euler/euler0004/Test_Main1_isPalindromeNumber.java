package com.lean.project.euler.euler0004;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_Main1_isPalindromeNumber {
	@Test
	public void testTrue() {
		boolean r = Main1.isPalindromeNumber(9009);
		Assert.assertEquals(true, r);
	}

	@Test
	public void testFalse() {
		boolean r = Main1.isPalindromeNumber(9001);
		Assert.assertEquals(false, r);
	}
}
