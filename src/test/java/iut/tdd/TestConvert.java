package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	
	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	
	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	
	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	
	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	
	@Test
	public void test_text2num_zero() {
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
}
