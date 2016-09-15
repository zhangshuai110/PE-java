package com.lean.project.euler.level0.euler0008;

import org.testng.annotations.Test;

import junit.framework.Assert;

@Test
public class Test_main1_findSeriesNum {

	public void testFindSeriesNum0() {
		// source == null;
		Assert.assertEquals(null, Main1.findSeriesNum(null, 4, 2));
		Assert.assertEquals(null, Main1.findSeriesNum("", 40, 2));
		String source = "73167176531330624919225119674426574742355349194934";
		Assert.assertEquals(null, Main1.findSeriesNum(source, 2, -1));
		Assert.assertEquals(null, Main1.findSeriesNum(source, -2, 1));
		Assert.assertEquals("73", Main1.findSeriesNum(source, 2, 1));
		Assert.assertEquals("31", Main1.findSeriesNum(source, 2, 2));
		Assert.assertEquals("16", Main1.findSeriesNum(source, 2, 3));
		Assert.assertEquals("1671", Main1.findSeriesNum(source, 4, 3));
		Assert.assertEquals("4934", Main1.findSeriesNum(source, 4, 47));
	}
}
