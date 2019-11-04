package array;/**
 * Created by Administrator on 2019/11/1.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName No832
 * @Description 翻转图像
 * @Date 2019/11/1 17:22
 **/
public class No832 {
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            for (int i=0;i<A.length;i++) {
                int lo = 0;
                int hi = A[i].length-1;
                // 1 0 1 0
                while(lo < hi){
                    // 水平反转后，再反转图片
                    int temp = A[i][lo];
                    // ^ 异或，相同为 0 不相同为 1.
                    A[i][lo] = A[i][hi]^ 1;
                    A[i][hi] = temp^1;
                    /**维护索引**/
                    lo++;
                    hi--;
                }
                // 如果是奇数，需要对中位数取反
                // note：1.中位数，2.奇偶判断条件
                int mid = A[i].length / 2;
                if (A[i].length % 2 != 0) {
                    A[i][mid] = A[i][mid]^1;
                }
            }
            return A;
        }
    }
}





