package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E806_NumberofLinesToWriteString {

    def numberOfLines(widths: Array[Int], S: String): Array[Int] = {
        var lastLength = 0
        var lines = 0
        for (c <- S){
            var curWidth = widths(c - 97)
            if (lastLength + curWidth > 100){
                lines+=1
                lastLength = curWidth
            } else {
                lastLength += curWidth
            }
        }
        if ( lastLength < 100 ) {
            lines += 1
        }
        Array[Int](lines, lastLength)
    }
}