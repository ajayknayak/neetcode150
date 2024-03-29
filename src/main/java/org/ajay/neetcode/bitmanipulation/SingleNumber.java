package org.ajay.neetcode.bitmanipulation;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1] 
 * Output: 1 
 * 
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2] 
 * Output: 4 
 * 
 * Example 3:
 * 
 * Input: nums = [1] Output: 1
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 30000,  -30000 <= nums[i] <= 30000 Each element in
 * the array appears twice except for one element which appears only once.
 * 
 * @author ajnayak
 *
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
    	
    	//Do all constraints validation
    	if(null == nums || nums.length == 0 || 1 > nums.length || nums.length > 30000) {
    		return 0;
    	}
    	
    	int singleNo=0;
    	for (int i = 0; i < nums.length; i++) {
    		singleNo ^= nums[i];
		}
    	return singleNo;
    	
    }
}
