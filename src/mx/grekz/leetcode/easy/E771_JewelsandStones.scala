package mx.grekz.leetcode.easy

object E771_JewelsandStones {
    def numJewelsInStones(J: String, S: String): Int = {
        S.replaceAll("[^" + J + "]","").length()
    }
}