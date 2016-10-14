/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author cogons
 */
public class Leetcode {
    
    public static String reverseString(String s) {
        StringBuilder t = new StringBuilder();
        int i;
        int l = s.length();
        for(i = 0;i < l;i++){
            t.append(String.valueOf(s.charAt(l-i-1)));     
            //System.out.print(String.valueOf(s.charAt(l-i-1)));
        }
        return t.toString();
    }
    
    public static boolean canWinNim(int n){
        //对方剩下4
        int i;
        i = n%6;
        switch(i){
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                break;
            case 4:
                return false;
        }
        return true;
    }
    

    public  static int singleNumber(int[] nums) {
        
        int l = nums.length;
        int[] flag = new int[l];
        int i,j=0;
        int k = 0;
        for(i=0;i<l;i++){
            if(flag[i] == 0){
                for(j=i+1;j<l;j++){
                    if(nums[i] == nums[j]) {flag[i]=flag[j]=1;break;}
                   
                }
                
            }

            if (j == l)
                if(flag[i] == 0) {
                 k = nums[i];
                 break;}
        
        }
//        for(i=0;i<l;i++){  if(flag[i] == 0)  k = nums[i];}   
        return k;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int[] a = { 4, 3, 3, 5, 4 };  

               
    }
    
    
    
}
