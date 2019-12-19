package idv.chuck.codewar.main;

import idv.chuck.codewar.Isogram;

public class IsogramMain {

	public static void main(String[] args) {
		String[] tests = new String[] {"Dermatoglyphics", "isogram", "moose", "isIsogram", "aba", "moOse", "thumbscrewjapingly", ""};
		
		for(String test : tests) {
			boolean result = Isogram.isIsogram(test);
			System.out.println("test=" + test + ", result=" +result);			
		}		
	}

}
