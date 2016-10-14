/**
 *
 * @author cogons
 */

public class Solution {
    public static int longestPalindrome(String s) {

    	int r;


		char[] a1 = s.toCharArray(); 
		int[] a2 = new int[a1.length];

		for(int i=0;i<a1.length;i++){
			a2[i] = (int)a1[i];
		}

		



        return a2[1];

    }

    public static void main(String[] args) {

    	System.out.println(longestPalindrome("String s"));

    }

}
