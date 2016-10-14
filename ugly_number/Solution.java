/**
 *
 * @author cogons
 */

public class Solution {
    public static boolean isUgly(int num) {

    	if(num<1) return false;
    	if(num ==1 ) return true;

		int b = num;
    	while(b%2 == 0){ b = b/2;}
    	while(b%3 == 0){ b = b/3;}
    	while(b%5 == 0){ b = b/5;}
   
		if(b==1) return true;
		else return false;

    }

    public static void main(String[] args) {

    	System.out.println(isUgly(11));

    }

}
