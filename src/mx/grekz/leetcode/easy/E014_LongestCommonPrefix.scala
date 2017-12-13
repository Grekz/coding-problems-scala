package mx.grekz.leetcode.easy

object E014_LongestCommonPrefix {
    def longestCommonPrefix(strs: Array[String]): String = {
        if ( strs.size < 1 ) return ""
        var res = strs(0)
        var str = strs.drop(1)
        for( s <- str ){
            while ( ! s.startsWith(res) )
                res = res.dropRight(1)
        }
        return res
    }
}