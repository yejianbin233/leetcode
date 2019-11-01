package No1;/**
 * Created by Administrator on 2019/11/1.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Solution
 * @Description 脑残版 - 猜数字，数组下标元素值相等则 + 1；
 * @Date 2019/11/1 17:14
 **/
class Solution {
    public int game(int[] guess, int[] answer) {
        int result = 0;
        for(int i=0;i<3;i++){
            result += guess[i] == answer[i] ? 1 : 0;
        }
        return result;
    }
}
