package idv.chuck.codewar.main;

import idv.chuck.codewar.DirReduction;

public class DirReductionMain {

	public static void main(String[] args) {		
		String[] result1 = DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
		for(int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		String[] result2 = DirReduction.dirReduc(new String[]{"NORTH","SOUTH","EAST","WEST"});
		for(int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
		String[] result3 = DirReduction.dirReduc(new String[]{"NORTH", "WEST", "EAST", "SOUTH", "WEST", "WEST"});
		for(int i = 0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
	}

}
