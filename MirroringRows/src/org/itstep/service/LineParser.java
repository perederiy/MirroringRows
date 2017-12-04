package org.itstep.service;

import java.util.ArrayList;

public class LineParser {
	public String getFinalText(String text) {
		String[] rows = text.split(" ");
		String finalText = "";
		for (int i = 0; i < rows.length; i++) {
			ArrayList<String> mirrorArr = new ArrayList<>();
			String finalMirror = "";
			String letterText = getLetterText(rows[i]);
			for (int j = letterText.length() - 1; j >= 0; j--) {
				String mirror = "";
				mirror = letterText.substring(j, j + 1);
				mirrorArr.add(mirror);
			}
			for (int k=0; k<rows[i].length(); k++){
				char[] numberArray = rows[i].toCharArray();
				if (Character.isDigit(numberArray[k])){
					String number = "";
					int index = 0;
					number = number + numberArray[k];
					index = index + k;
					mirrorArr.add(index, number);
				}
				finalMirror = finalMirror + mirrorArr.get(k);
			}
			finalText = finalText + " " + finalMirror;
		}		
		return finalText.trim();
	}

	public String getLetterText(String rows) {
		String line="";
		char[] lineArray = rows.toCharArray();
		for(int i=0; i<rows.length(); i++){
			if (Character.isLetter(lineArray[i])){
				line = line + lineArray[i];
			}
		}
		return line;
	}
}
