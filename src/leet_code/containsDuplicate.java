package leet_code;
import java.util.HashSet;

public class containsDuplicate {
	
	public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> same = new HashSet();
        for(int num:nums){
            if(same.contains(num)){
                return true;
            }same.add(num);
        }return false;
    }

	    public static void main(String[] args) {
	    	containsDuplicate solution = new containsDuplicate();
	        
	        int[] nums1 = {1, 2, 3, 3};
	        System.out.println(solution.hasDuplicate(nums1)); // Output: true
	        
	       /* int[] nums2 = {1, 2, 3, 4};
	        System.out.println(solution.hasDuplicate(nums2)); // Output: false*/
	    }
	}

	
