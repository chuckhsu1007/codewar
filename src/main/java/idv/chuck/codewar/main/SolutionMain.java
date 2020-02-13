package idv.chuck.codewar.main;

import idv.chuck.codewar.Solution;

public class SolutionMain {

	public static void main(String[] args) {
		String result1 = Solution.whoLikesIt();
		System.out.println(result1);
		
		String result2 = Solution.whoLikesIt("Peter");
		System.out.println(result2);
		
		String result3 = Solution.whoLikesIt("Jacob", "Alex");
		System.out.println(result3);
		
		String result4 = Solution.whoLikesIt("Max", "John", "Mark");
		System.out.println(result4);
		
		String result5 = Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max");
		System.out.println(result5);
		
		String result6 = Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Chuck");
		System.out.println(result6);

	}

}
