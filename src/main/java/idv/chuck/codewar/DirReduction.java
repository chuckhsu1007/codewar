package idv.chuck.codewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Directions Reduction
//Best pratices, Use stack
public class DirReduction {
	public static String[] dirReduc(String[] arr) {		
		List<String> result = Arrays.asList(arr);
		boolean completed = false;
		while(completed == false) {
			List<String> temp = new ArrayList<String>();
			for(int i = 0; i< result.size(); i++) {
				if(i == result.size() - 1) {
					if(!result.get(i).equals("")) {
	    				temp.add(result.get(i));
	    			}
					continue;
				}
				if(result.get(i).equals("NORTH") && result.get(i + 1).equals("SOUTH")) {
					result.set(i, "");
					result.set(i + 1, "");
    			}
    			if(result.get(i).equals("SOUTH") && result.get(i + 1).equals("NORTH")) {
    				result.set(i, "");
					result.set(i + 1, "");
    			}
    			if(result.get(i).equals("WEST") && result.get(i + 1).equals("EAST")) {
    				result.set(i, "");
					result.set(i + 1, "");
    			}
    			if(result.get(i).equals("EAST") && result.get(i + 1).equals("WEST")) {
    				result.set(i, "");
					result.set(i + 1, "");
    			}
    			if(!result.get(i).equals("")) {
    				temp.add(result.get(i));
    			}
			}
						
			if(result.size() == temp.size()) {
				completed = true;
			}
			else {
				result = new ArrayList<String>(temp);							
			}			
		}
				       
		return result.toArray(new String[result.size()]);		       
    }
}
