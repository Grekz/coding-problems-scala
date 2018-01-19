package mx.grekz.leetcode.hard

import scala.collection.mutable.Stack

object E032_LongestValidParentheses {
  
    def longestValidParentheses(s: String): Int = {
        if (s == null || s.length() < 2) return 0;
        var res = 0;
        var stack = Stack[Int]();
        stack.push(-1);
        var i = 0;
        for( x <- s ){
            if (x == '('){
                stack.push(i);
            }else{
                stack.pop();
                if (!stack.isEmpty)
                    res = Math.max(res, i - stack.top );
                else
                    stack.push(i);
            }
                i+=1;
        }
        return res;
    }
}