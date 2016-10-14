/**
 *
 * @author cogons
 */

public class Solution {
    public static boolean canWinNim(int n) {

    	if(n>3)
    		if(n%4 ==0) return false;
    		else return true;
    	else return true;

    }

    public static void main(String[] args) {

System.out.println(canWinNim(2));

    }

}
