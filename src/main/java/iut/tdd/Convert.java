package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		if(input.equals("0"))
			return "zéro";
		return null;
	}
	public static String text2num(String input) {
		if(input.equals("zéro"))
			return "0";
		return null;
	}
}