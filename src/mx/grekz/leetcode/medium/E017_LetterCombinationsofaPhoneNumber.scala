package mx.grekz.leetcode.medium

object E017_LetterCombinationsofaPhoneNumber {  
    def letterCombinations(digits: String): List[String] = {
        if ( digits.length() < 1 || digits.contains("0") || digits.contains("1"))
            return List[String]()
        val vals = Map(
            '2' -> "abc",
            '3' -> "def",
            '4' -> "ghi",
            '5' -> "jkl",
            '6' -> "mno",
            '7' -> "pqrs",
            '8' -> "tuv",
            '9' -> "wxyz"
        )
        val reducer : (List[String], Char) => List[String] = (x, y) => { 
            var tmp = List[String]()
            for ( i <- x ) {
                for ( j <- vals(y) ) { 
                    tmp :+ (i+j).toString
                } 
            }
            tmp
        }
        return digits.foldLeft(List(""))(reducer)
    }
}