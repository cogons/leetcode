/**
 *
 * @author cogons
 */

public class Solution {
    public static char findTheDifference(String s, String t) {

    	int i,j,a = 0,b =0;

    	for(i=0;i<s.length();i++)
    		a = a + s.charAt(i);
    	for(i=0;i<t.length();i++)
    		b = b + t.charAt(i);

        return (char)(b-a);

    }

    public static void main(String[] args) {

    	System.out.println(findTheDifference("abcd","abcde"));

    }

}
