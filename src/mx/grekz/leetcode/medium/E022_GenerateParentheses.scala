package mx.grekz.leetcode.medium

import scala.collection.mutable.Buffer

object E022_GenerateParentheses {
    def generateParenthesis(n: Int): List[String] = {
        return btHelper("",n,n,Buffer.empty[String]).toList
    }
    
    def btHelper(st :String, ope :Int, clo :Int, res : Buffer[String]) :Buffer[String] = {
        if ( ope > 0 ) btHelper(st + "(", ope - 1, clo, res)
        if ( clo > ope ) btHelper(st + ")", ope, clo - 1, res)
        if ( clo < 1 ) res += st
        return res
    }
}