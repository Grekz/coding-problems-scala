package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E762_PrimeNumberofSetBitsinBinaryRepresentation {

    def countPrimeSetBits(L: Int, R: Int): Int = {
       L.to(R)
        .map(665772 >> Integer.bitCount(_) & 1)
        .sum
    }
}