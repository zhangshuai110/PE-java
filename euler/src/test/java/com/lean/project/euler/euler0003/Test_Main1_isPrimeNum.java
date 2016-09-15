package com.lean.project.euler.euler0003;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_Main1_isPrimeNum {
	@Test
	public void Test_isPrimeNum() {
		Assert.assertEquals(true, Main1.isPrimeNum(2));
		Assert.assertEquals(true, Main1.isPrimeNum(3));
		Assert.assertEquals(true, Main1.isPrimeNum(5));
		Assert.assertEquals(false, Main1.isPrimeNum(4));
	}
}
