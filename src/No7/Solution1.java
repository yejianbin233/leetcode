package No7;/**
 * Created by Administrator on 2019/11/1.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Solution1
 * @Description 整数反转 - 递归
 * @Date 2019/11/1 15:47
 **/
/*
* 不使用辅助空间 - 栈...
* */
public class Solution1 {
    class Solution {
        public int reverse(int x) {
            int temp = x;
            // 数位 - 个十百千万...
            int n = 0;
            // 计算 x 的数位
            while(x != 0){
                x /= 10;
                n++;
            }
            // 通过迭代来反转整数，类似使用辅助栈（迭代方式类似于虚拟栈）
            long result = reverseInt(temp,n);
            // 溢出判断，分为正、负溢出边界判断
            if (result > 0){
                return result > 2147483647 ?  0 : (int) result;
            }else{
                return result < -2147483648 ?  0 : (int) result;
            }
        }
        private long reverseInt(int x,int n){
            // 递归基 - 当 x 为 0 时，退出迭代，计算反转结果
            if (x == 0){
                return 0;
            }
            int temp = x / 10;
            int a = x % 10;
            // 递归深入
            long result = reverseInt(temp,--n);
            // 计算结果
            result = (long) (result + a * Math.pow(10,n));
            return result;
        }
    }
}
