package org.itstep.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineParserTest {

	@Test
	public void  testGetFinalText (){
		String finalText = "a1bc2 ef3gh";
		LineParser parser = new LineParser();
		String outText = parser.getFinalText(finalText);
		assertEquals("c1ba2 hg3fe", outText);
		
		
	}
	
	@Test
	public void  testGetLetterText (){
		String letter = "a1bc2";
		LineParser parser = new LineParser();
		String outText = parser.getLetterText(letter);
		assertEquals("abc", outText);
		
		
	}

}
