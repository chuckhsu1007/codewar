package idv.chuck.codewar.main;

import idv.chuck.codewar.Kata;

public class KataMain {

	public static void main(String[] args) {
		String result = Kata.getMiddle("testing");
		System.out.println(result);
		
		String result2 = Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
		System.out.println(result2);

	}

}
