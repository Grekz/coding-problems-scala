package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E999_AvailableCapturesforRook {
    def numRookCaptures(board: Array[Array[Char]]): Int = {
        val rows = board.length
        val cols = board(0).length
        var ans = 0
        var posR = 0
        var posC = 0
        breakable {
            for ( i <- 0 until rows; j <- 0 until cols ) {
                if ( board(i)(j) == 'R' ) {
                    posR = i
                    posC = j
                    break
                }
            }   
        }
        breakable {
            for ( i <- posR + 1 until rows)
                if ( board(i)(posC) != '.' ) {
                    if ( board(i)(posC) == 'p' )
                        ans += 1
                    break
                }   
        }
        breakable {
            for ( i <- posR - 1 to 0 by -1 )
                if ( board(i)(posC) != '.' ) {
                    if ( board(i)(posC) == 'p' )
                        ans += 1
                    break
                }   
        }
        breakable {
            for ( i <- posC + 1 until cols )
                if ( board(posR)(i) != '.' ) {
                    if ( board(posR)(i) == 'p' )
                        ans += 1
                    break
                }   
        }
        breakable {
            for ( i <- posC - 1 to 0 by -1 )
                if ( board(posR)(i) != '.' ) {
                    if ( board(posR)(i) == 'p' )
                        ans += 1
                    break
                }   
        }
        return ans
    }
}