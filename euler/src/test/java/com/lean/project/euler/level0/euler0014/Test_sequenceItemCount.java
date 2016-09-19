package com.lean.project.euler.level0.euler0014;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_sequenceItemCount {
	@Test
	public void test_sequenceItemCount() {
		Assert.assertEquals(Main1.sequenceItemCount(1), 4);
		Assert.assertEquals(Main1.sequenceItemCount(13), 10);
	}
}
