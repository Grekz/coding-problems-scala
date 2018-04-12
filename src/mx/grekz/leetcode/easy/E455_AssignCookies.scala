package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E455_AssignCookies {

    def findContentChildren(g: Array[Int], s: Array[Int]): Int = {
        scala.util.Sorting.quickSort(g)
        scala.util.Sorting.quickSort(s)
        var (gi, si) = (0,0)
        var (gn, sn) = (g.length, s.length)
        while ( gi < gn && si < sn ) {
            if ( g(gi) <= s(si) ) {
                gi+=1
            }
            si+=1
        }
        gi
    }
}