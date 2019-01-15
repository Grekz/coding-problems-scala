package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E973_KClosestPointstoOrigin {
    def kClosest(points: Array[Array[Int]], K: Int): Array[Array[Int]] = {
        points.sortWith( (a,b) => (a(0)*a(0)+a(1)*a(1)) < (b(0)*b(0)+b(1)*b(1)) ).slice(0, K)
    }
}