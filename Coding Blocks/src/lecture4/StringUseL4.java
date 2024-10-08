package lecture4;

import java.util.Scanner;

public class StringUseL4 {
	
	// I am here in the video lecture on Video 00003 of 4th Class. //

	public static String minLengthWord(String input) {
		int minWordLength = -1;
		String minWord = input;
		int i = 0;
		for (; i < input.length(); i++) {
			if (input.charAt(i) == ' ' || input.charAt(i) == '\t' || input.charAt(i) == '\n') {
				minWord = input.substring(0, i);
				minWordLength = minWord.length();
				i++;
				break;
			}
		}
		
		// Ask from sir//
		if (minWordLength == -1) {
			return input;
		}
		
		int currentWordStartIndex = i;
		for (; i < input.length(); i++) {
			if (input.charAt(i) == ' ' || input.charAt(i) == '\t' || input.charAt(i) == '\n') {
				String newWord = input.substring(currentWordStartIndex, i);
				if (newWord.length() < minWordLength) {
					minWord = newWord;
					minWordLength = newWord.length();
				}
				currentWordStartIndex = i + 1;
			}
		}
		String newWord = input.substring(currentWordStartIndex);
		if (newWord.length() < minWordLength) {
			minWord = newWord;
			minWordLength = newWord.length();
		}
		
		return minWord;
	}
	
	// I am here in the video lecture on Video 00003 of 4th Class. //
	
	public static void numOfWordsCharsLines() {
		Scanner s = new Scanner(System.in);
		boolean done = false;
		int lines = 0;
		int chars = 0;
		int words = 0;
		
		while (!done) {
			String line = s.nextLine();
			words++;
			lines++;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '$') {
					done = true;
					break;
				}
				chars++;
				if (line.charAt(i) == ' ' || line.charAt(i) == '\t') {
					words++;
				}
			}
		}
		System.out.println("lines " + lines);
		System.out.println("words " + words);
		System.out.println("chars " + chars);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		numOfWordsCharsLines();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(minLengthWord(s));
// 	    scanner.useDelimiter("");
//		String str = scanner.next();
//		System.out.println(str);
//   	    str = scanner.next();
//		System.out.println(str);
//			
//				
//		String str2 = scanner.nextLine();
//		System.out.println(str2);



	}

}
