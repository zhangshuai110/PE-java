package com.lean.project.euler.euler0010;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_main_numPrimes {
	@Test
	public void test_numPrimes3() {
		boolean[] primes = Main1.numPrimes(3);
		Assert.assertEquals(true, primes[0]);
		Assert.assertEquals(true, primes[1]);
		Assert.assertEquals(false, primes[2]);
		Assert.assertEquals(false, primes[3]);
	}

	@Test
	public void test_numPrimes10() {
		boolean[] primes = Main1.numPrimes(10);
		Assert.assertEquals(true, primes[0], "0");
		Assert.assertEquals(true, primes[1], "1");
		Assert.assertEquals(false, primes[2], "2");
		Assert.assertEquals(false, primes[3], "3");
		Assert.assertEquals(true, primes[4], "4");
		Assert.assertEquals(false, primes[5], "5");
		Assert.assertEquals(true, primes[6], "6");
		Assert.assertEquals(false, primes[7], "7");
		Assert.assertEquals(true, primes[8], "8");
		Assert.assertEquals(true, primes[9], "9");
		Assert.assertEquals(true, primes[10], "10");
	}

	@Test
	public void test_numPrimes50() {
		boolean[] primes = Main1.numPrimes(50);
		Assert.assertEquals(true, primes[0], "0");
		Assert.assertEquals(true, primes[1], "1");
		Assert.assertEquals(false, primes[2], "2");
		Assert.assertEquals(false, primes[3], "3");
		Assert.assertEquals(true, primes[4], "4");
		Assert.assertEquals(false, primes[5], "5");
		Assert.assertEquals(true, primes[6], "6");
		Assert.assertEquals(false, primes[7], "7");
		Assert.assertEquals(true, primes[8], "8");
		Assert.assertEquals(true, primes[9], "9");
		Assert.assertEquals(true, primes[10], "10");

		Assert.assertEquals(false, primes[11], "11");
		Assert.assertEquals(true, primes[12], "12");
		Assert.assertEquals(false, primes[13], "13");
		Assert.assertEquals(true, primes[14], "14");
		Assert.assertEquals(true, primes[15], "15");
		Assert.assertEquals(true, primes[16], "16");
		Assert.assertEquals(false, primes[17], "17");
		Assert.assertEquals(true, primes[18], "18");
		Assert.assertEquals(false, primes[19], "19");
		Assert.assertEquals(true, primes[20], "20");

		Assert.assertEquals(true, primes[21], "21");
		Assert.assertEquals(true, primes[22], "22");
		Assert.assertEquals(false, primes[23], "23");
		Assert.assertEquals(true, primes[24], "24");
		Assert.assertEquals(true, primes[25], "25");
		Assert.assertEquals(true, primes[26], "26");
		Assert.assertEquals(true, primes[27], "27");
		Assert.assertEquals(true, primes[28], "28");
		Assert.assertEquals(false, primes[29], "29");
		Assert.assertEquals(true, primes[30], "30");

		Assert.assertEquals(false, primes[41], "41");
		Assert.assertEquals(true, primes[42], "42");
		Assert.assertEquals(false, primes[43], "43");
		Assert.assertEquals(true, primes[44], "44");
		Assert.assertEquals(true, primes[45], "45");
		Assert.assertEquals(true, primes[46], "46");
		Assert.assertEquals(false, primes[47], "47");
		Assert.assertEquals(true, primes[48], "48");
		Assert.assertEquals(true, primes[49], "49");
		Assert.assertEquals(true, primes[40], "40");
	}

	@Test
	public void test_numPrimes1000() {
		boolean[] primes = Main1.numPrimes(1000);
		Assert.assertEquals(false, primes[79], "79");
		Assert.assertEquals(false, primes[89], "89");
		Assert.assertEquals(false, primes[97], "97");
	}
}
