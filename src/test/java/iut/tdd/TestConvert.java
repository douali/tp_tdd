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
	public void test_num2text_cinq() {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	
	@Test
	public void test_num2text_six() {
		Assert.assertEquals("six", Convert.num2text("6"));
	}
	
	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}
	
	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}
	
	@Test
	public void test_num2text_dix() {
		Assert.assertEquals("dix", Convert.num2text("10"));
	}
	
	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("onze", Convert.num2text("11"));
	}
	@Test
	public void test_num2text_douze() {
		Assert.assertEquals("douze", Convert.num2text("12"));
	}
	@Test
	public void test_num2text_treize() {
		Assert.assertEquals("treize", Convert.num2text("13"));
	}
	@Test
	public void test_num2text_quatorze() {
		Assert.assertEquals("quatorze", Convert.num2text("14"));
	}
	@Test
	public void test_num2text_quinze() {
		Assert.assertEquals("quinze", Convert.num2text("15"));
	}
	
	@Test
	public void test_num2text_seize() {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}
	@Test
	public void test_num2text_vingt() {
		Assert.assertEquals("vingt", Convert.num2text("20"));
	}
	
	@Test
	public void test_num2text_trente() {
		Assert.assertEquals("trente", Convert.num2text("30"));
	}
	@Test
	public void test_num2text_quarante() {
		Assert.assertEquals("quarante", Convert.num2text("40"));
	}
	@Test
	public void test_num2text_cinquante() {
		Assert.assertEquals("cinquante", Convert.num2text("50"));
	}
	@Test
	public void test_num2text_soixante() {
		Assert.assertEquals("soixante", Convert.num2text("60"));
	}

	@Test
	public void test_num2text_cent() {
		Assert.assertEquals("cent", Convert.num2text("100"));
	}
	
	@Test
	public void test_num2text_mille() {
		Assert.assertEquals("mille", Convert.num2text("1000"));
	}
	@Test
	public void test_text2num_zero() {
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
	@Test
	public void test_text2num_un() {
		Assert.assertEquals("1", Convert.text2num("un"));
	}
	@Test
	public void test_text2num_deux() {
		Assert.assertEquals("2", Convert.text2num("deux"));
	}
	@Test
	public void test_text2num_trois() {
		Assert.assertEquals("3", Convert.text2num("trois"));
	}
	@Test
	public void test_text2num_quatre() {
		Assert.assertEquals("4", Convert.text2num("quatre"));
	}
	@Test
	public void test_text2num_cinq() {
		Assert.assertEquals("5", Convert.text2num("cinq"));
	}
}
