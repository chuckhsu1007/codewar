package idv.chuck.codewar.main;

import idv.chuck.codewar.Solution;

public class SolutionMain {

	public static void main(String[] args) {
		mainWhoLikesIt(args);
		mainTwoSum(args);
	}
	
	public static void mainWhoLikesIt(String[] args) {
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
	
	public static void mainTwoSum(String[] args) {
		basicTests();

	}
	
	public static void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    
	private static void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = Solution.twoSum(numbers, target);
        if ( null == actual )
        {
            System.out.format("Received a null\n");
            
        }
        if ( actual.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");            
        }
        
        int received = numbers[actual[0]] + numbers[actual[1]];
        
        System.out.println("target = " + target + ", received = " + received + ", index1 = " + actual[0] + ", index2 = " + actual[1]);
        
    }

}
