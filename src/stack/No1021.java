package stack;/**
 * Created by Administrator on 2019/11/4.
 */

import java.util.Stack;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName No1021
 * @Description 删除最外层的括号
 * @Date 2019/11/4 17:24
 **/
public class No1021 {

    public static void main(String[] args) {
        No1021 no1021 = new No1021();

        System.out.println(no1021.removeOuterParentheses("(()())(())"));
    }

    // 利用栈的思想，不使用栈结构
    public String removeOuterParentheses(String S) {
        // 需要模拟栈
        int num = 0;// 记录 '(' 的数量，遇到 ')' 减一，如果 num 为 0 则说明匹配一个完整的原语
        // 原语的起点
        int index = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') num++;
            else if (S.charAt(i) == ')') {
                num--;
                if (num == 0) {
                    sb.append(S.substring(index+1,i));
                    index = i+1;
                }
            }
        }
        return sb.toString();
    }
}

class SolutionNo1021 {
    // 利用数据结构栈
    public String removeOuterParentheses(String S) {
        // 优化
        //String result = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        // 原语的起点
        int start = 0;
        // 原语的末端
        int end = 0;

        for (int i = 0; i < S.length(); i++) {
            // 如果是 "(" 则直接进栈
            if ('(' == S.charAt(i))
                stack.push(S.charAt(i));

            else if (')' == S.charAt(i)) {
                // 如果是 ")" 则出栈
                stack.pop();
                // 判断栈元素是否为空，如果为空则说明找到了一个原语
                if (stack.isEmpty()) {
                    end = i;
                    // result +=S.substring(start+1,end);
                    sb.append(S.substring(start + 1, end));
                    // 维护下一个原语的起点
                    start = end + 1;
                }
            }
        }
        return sb.toString();
    }

}


