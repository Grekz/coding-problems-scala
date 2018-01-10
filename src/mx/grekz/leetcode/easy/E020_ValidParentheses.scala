package mx.grekz.leetcode.easy

import scala.collection.mutable.Stack

object E020_ValidParentheses {
    def isValid(s: String): Boolean = {
        if ( s == null || s.length < 1 ) 
            return true
        if ( s.length == 1 )
            return false
        val open = "({["
        val close = ")}]"
        var stack = Stack[Character]()
        for ( cur <- s ) {
            if (open.indexOf(cur) != -1 ) 
                stack.push(cur)
            else if ( stack.length < 1 || open.indexOf(stack.pop()) != close.indexOf(cur) ) 
                return false
        }
        return stack.length == 0
    }
}