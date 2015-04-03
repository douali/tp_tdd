package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	
	@Test
	public void test_text2num_zero() {
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
}
