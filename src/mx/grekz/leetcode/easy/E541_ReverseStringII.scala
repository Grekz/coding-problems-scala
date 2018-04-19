package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E541_ReverseStringII {

    def reverseStr(s: String, k: Int): String = {
        var cArr = s.toCharArray()
        var n = cArr.length
        for( i <- 0 to n by 2 * k ){
            var ii = i
            var j = if ( i + k - 1 > n - 1 ) n - 1 else i + k - 1
            while(ii<j){
                var tmp = cArr(ii)
                cArr(ii) = cArr(j)
                ii+=1
                cArr(j) = tmp
                j -=1
            }
        }
        String.valueOf(cArr)
    }
}