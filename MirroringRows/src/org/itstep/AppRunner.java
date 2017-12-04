package org.itstep;

import org.itstep.service.LineParser;
import org.itstep.pojo.MirRows;

public class AppRunner {

	public static void main(String[] args) {
		MirRows text = new MirRows("a1bc2 ef3gh ij4k5");
		
		LineParser parser = new LineParser();
		String finalText = parser.getFinalText(text.getRows());
		
		System.out.println("Value: "+ text.getRows());
		System.out.println("Value change: "+ finalText);
	}
}