/**
 *
 * @author cogons
 */

public class Solution {
    public static void moveZeroes(int[] nums) {

    	int temp;
    	int j=0;

    	for(int i=0;i<nums.length;i++){

    		if(nums[i] != 0){ 
    			temp = nums[i];
    			nums[i] = nums[j];
    			nums[j] = temp;
    			j++;}

    	}


    }

    public static void main(String[] args) {

    	int[] a = {0, 3, 0, 5, 4};
		moveZeroes(a);
    	System.out.print(java.util.Arrays.toString(a));

    }

}
