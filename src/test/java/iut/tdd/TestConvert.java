package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		//Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		//When
		String actual = myConvert.num2text(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	
	@Test
	public void test_text2num_zero() {
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
}
