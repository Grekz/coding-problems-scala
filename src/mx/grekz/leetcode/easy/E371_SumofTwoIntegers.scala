package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E371_SumofTwoIntegers {
    def getSum(a: Int, b: Int): Int = {
        val tMAX = 0x7FFFFFFF
        val mask = 0xFFFFFFFF
        var aa = a
        var bb = b
        while(bb != 0) {
            var tmp = aa
            aa = ( aa ^ bb ) & mask
            bb = ((tmp & bb) << 1) & mask
        }
        if (aa <= tMAX) {
            return aa
        }
        return  ~(aa ^ mask)
    }
}