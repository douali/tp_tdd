package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
		
	public static String num2text(String input) {
		String[] num0_9 = new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","20","30","40","50","60"};
		String[] text0_9 = new String[]{"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf","dix","onze","douze","treize","quatorze","quinze","seize",
				"vingt","trente","quarante","cinquante","soixante"};
		Map<String, String> convert = new HashMap<String, String>();
		for(int i = 0; i < 22; i++)
			convert.put(num0_9[i], text0_9[i]);
		return convert.get(input);
	}
	public static String text2num(String input) {
		if(input.equals("zéro"))
			return "0";
		return null;
	}
}