package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E492_ConstructtheRectangle {
    def constructRectangle(area: Int): Array[Int] = {
        var w = math.sqrt(area).toInt
        while ( area % w != 0 )
            w -=1
        Array(area / w, w)
    }
}