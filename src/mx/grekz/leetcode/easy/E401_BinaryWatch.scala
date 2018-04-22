package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E401_BinaryWatch {
    def readBinaryWatch(num: Int): List[String] = {
        var res = List[String]()
        for (  i <- 0 to 11; j <- 0 to 59 )
            if ( Integer.bitCount( i ) + Integer.bitCount( j ) == num )
                res :+= "%d:%02d".format(i,j)
        return res
    }
}