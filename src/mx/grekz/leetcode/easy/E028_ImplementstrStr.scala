package mx.grekz.leetcode.easy

object E028_ImplementstrStr {
  
    def strStr(haystack: String, needle: String): Int = {
        return strStr(haystack, needle, 0);
    }
    def strStr(haystack: String, needle: String, idx: Int): Int = {
        val nLen = needle.length();
        if ( haystack.length()-idx < nLen ) { return -1; }        
        if ( haystack.substring(idx, idx+nLen).equals(needle) ) { return idx; } 
        return strStr(haystack, needle, idx+1);
    }
}