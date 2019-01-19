package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E976_LargestPerimeterTriangle {
    def largestPerimeter(A: Array[Int]): Int = {
        scala.util.Sorting.quickSort(A)
        for( i <- A.length -1 to 2 by -1) {
            if (A(i)<A(i-2)+A(i-1))
                return A(i)+A(i-2)+A(i-1)
        }
        0
    }
}