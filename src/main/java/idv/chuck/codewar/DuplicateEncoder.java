package idv.chuck.codewar;

import java.util.HashMap;
import java.util.Map;

/**
 * Duplicate Encoder
 * @author Chuck
 *
 */
public class DuplicateEncoder {

	public static String encode(String word) {
		String leftScratch = "(";
		String rightScratch = ")";
		Map<Character, String> statisticsSymbol = new HashMap<Character, String>();
		word = word.toLowerCase();
		for(char c : word.toCharArray()) {
			if(statisticsSymbol.containsKey(c)) {
				statisticsSymbol.put(c, rightScratch);
			}
			else {
				statisticsSymbol.put(c, leftScratch);
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(char c : word.toCharArray()) {
			result.append(statisticsSymbol.get(c));
		}
					
		return result.toString();
	}
	
	/**
	 * beset practice
	 * @param word
	 * @return
	 */
	public static String encode2(String word) {
		word = word.toLowerCase();
		StringBuilder result = new StringBuilder();
		for(char c : word.toCharArray()) {
			result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
		}
		return result.toString();
	}
}
