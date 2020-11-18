package idv.chuck.codewar;


public class Solution {
	/**
	 * Who likes it?
	 * @param names
	 * @return
	 */
	public static String whoLikesIt(String... names) {
		switch (names.length) {
		case 0:
			return "no one likes this";
		case 1:
			return String.format("%s likes this", names[0]);
		case 2:
			return String.format("%s and %s like this", names[0], names[1]);
		case 3:
			return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
		default:
			return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
		}
	}
	
	/**
	 * Two Sum
	 * @param numbers
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] numbers, int target)
    {
		int result[] = null;
		for(int firstLoopIndex = 0; firstLoopIndex < numbers.length -1; firstLoopIndex++) {
			for(int secondLoopIndex = 1; secondLoopIndex < numbers.length ; secondLoopIndex++) {
				if(target == numbers[firstLoopIndex] + numbers[secondLoopIndex]) {
					result = new int[2];
					result[0] = firstLoopIndex;
					result[1] = secondLoopIndex;
					return result;
				}
			}
		}
		
        return result;
    }
	
}
