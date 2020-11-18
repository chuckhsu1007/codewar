package idv.chuck.codewar.main;

import idv.chuck.codewar.DuplicateEncoder;

public class DuplicateEncoderMain {

	public static void main(String[] args) {
		
		String[] tests = new String[] {"din", "recede", "Success", "(( @"};
		
		for(String test : tests) {
			System.out.println(DuplicateEncoder.encode2(test));
		}
	}

}
