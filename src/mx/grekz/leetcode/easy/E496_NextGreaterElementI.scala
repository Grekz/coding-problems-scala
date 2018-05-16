package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E496_NextGreaterElementI {
    def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        var m = scala.collection.mutable.Map[Int,Int]().withDefaultValue(-1)
        var s = scala.collection.mutable.Stack[Int]()
        for ( x <- nums2 ) {
            while( !s.isEmpty && s.top < x )
                m(s.pop) = x
            s.push(x)
        }
        for ( (x,i) <- nums1.zipWithIndex ) {
            nums1(i) = m(x)
        }
        nums1
    }
}