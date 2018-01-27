package mx.grekz.leetcode.easy

object E066_PlusOne {
    def plusOne(digits: Array[Int]): Array[Int] = {
        var le = digits.length;
        for ( i <- Range(le-1, -1, -1)) {
            if ( digits(i) < 9 ) {
                digits(i) += 1;
                return digits;
            }
            digits(i) = 0;
        }
        return 1 +: digits;
    }  
}