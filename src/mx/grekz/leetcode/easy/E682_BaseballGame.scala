package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E682_BaseballGame {
    def calPoints(ops: Array[String]): Int = {
        var res = 0
        var v = 0
        var rnd = List[Int]()
        for ( x <- ops ) {
            var l = rnd.size - 1
            if ( x == "C" ) {
                v = -rnd(l)
                rnd = rnd.dropRight(1)
            } else {
                if ( x == "+" )
                    v = rnd(l) + rnd(l-1)
                else if ( x == "D" )
                    v = 2 * rnd(l)
                else
                    v = x.toInt
                rnd :+= v
            }
            res += v
        }
        res
    }
}