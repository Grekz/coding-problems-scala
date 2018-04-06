package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E434_NumberofSegmentsinaString {

    def countSegments(s: String): Int = {
        ("a "+ s).split(" +").length - 1
    }
}