package No7;/**
 * Created by Administrator on 2019/11/1.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Solution3
 * @Description 使用辅助空间 - 队列，利用先进先出
 * @Date 2019/11/1 16:47
 **/
public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.reverse(123));
    }
    Queue<Integer> queue = new LinkedList<>();
    public int reverse(int x) {
        while (x != 0) {
            queue.add(x % 10);
            x /= 10;
        }
        long result = 0;
        while(!queue.isEmpty()){
            result = result*10+queue.poll();
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int)result;
    }
}
