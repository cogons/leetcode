/**
 *
 * @author cogons
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

public class Solution {
    public static int addDigits(int num) {

 	   int k =num;
 	   int a,b;   
       while(k>9){
       	    a = k%10;
       	    b = k/10;
    		k = a+b;
    	}
        return k;

    }

    public static void main(String[] args) {

		System.out.println(addDigits(38));

    }

}
