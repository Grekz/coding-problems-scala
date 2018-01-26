package mx.grekz.leetcode.easy

object E058_LengthofLastWord {
    def lengthOfLastWord(s: String): Int = {
        var _s = s.trim()
        var le = _s.length()
        var li = _s.lastIndexOf(' ')
        return le - li - 1
    }
}