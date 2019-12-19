package idv.chuck.codewar;

import java.util.HashSet;
import java.util.Set;

//Isograms
public class Isogram {
	public static boolean isIsogram(String str) {
		char[] strInChars = str.toLowerCase().toCharArray();
		Set<Character> existChars = new HashSet<Character>();
		for (char strInChar : strInChars) {
			if (existChars.contains(strInChar)) {
				return false;
			} else {
				existChars.add(Character.valueOf(strInChar));
			}
		}
		return true;
		//best practies
		// return str.length() == str.toLowerCase().chars().distinct().count();
	}
}
