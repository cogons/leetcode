/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cogons
 */
public class Solution {
    public static int singleNumber(int[] nums) {

        int l = nums.length;
        int[] flag = new int[l];
        int i, j = 0;
        int k = 0;
        for (i = 0; i < l; i++) {
            if (flag[i] == 0) {
                for (j = i + 1; j < l; j++) {
                    if (nums[i] == nums[j]) {
                        flag[i] = flag[j] = 1;
                        break;
                    }
                }
            }

            if (j == l) {
                if (flag[i] == 0) {
                    k = nums[i];
                    break;
                }
            }
        }

        return k;

    }

    public static void main(String[] args) {

        // TODO code application logic here
        int[] a = {4, 3, 3, 5, 4};
        System.out.println(singleNumber(a));

    }

}
