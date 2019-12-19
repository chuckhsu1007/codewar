package idv.chuck.codewar;

import java.util.Arrays;

public class Kata {
	/**
	 * Get the Middle Character
	 * 
	 * @param word
	 * @return
	 */
	public static String getMiddle(String word) {
		int wordLength = word.length();

		if (wordLength == 1) {
			return word;
		}

		char[] wordInChars = word.toCharArray();
		int lastMiddleIndex = wordLength / 2;

		StringBuilder result = new StringBuilder();
		if (wordLength % 2 == 0) {
			// word=test, length=4, middle index= 1 to 2
			// word=middle, length=6, middle index=2 to 3
			result.append(wordInChars[lastMiddleIndex - 1]);
		}
		result.append(wordInChars[lastMiddleIndex]);
		return result.toString();

	}
	
	/**
	 * Create Phone Number
	 * @param numbers
	 * @return
	 */
	public static String createPhoneNumber(int[] numbers) {
		//1234567890
		//(123) 456-7890
		Integer[] innerNumbers = new Integer[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			Integer innerNumber = new Integer(numbers[i]);
			innerNumbers[i] = innerNumber;
		}
		String result = String.format("(%d%d%d) %d%d%d-%d%d%d%d", innerNumbers);		
	    return result;
	    
	    //
	    //return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
	    //return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
	    
	    
	  }
}
