package No7;/**
 * Created by Administrator on 2019/11/1.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Solution2
 * @Description 整数反转 - 迭代
 * @Date 2019/11/1 15:58
 **/
public class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-2147483412));
    }

}
class Solution {
    public int reverse(int x) {
        long y = 0;
        while (x != 0) {
            // 反转
            y += x % 10;
            x = x / 10;
            // 每次迭代 * 10;
            y = y * 10;
            // 最后一次 / 10
            if(x == 0){
                y /= 10;
            }
            // 如果迭代过程发现溢出，则立刻返回
            if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
                return 0;

        }
        return (int)y;
    }
}
