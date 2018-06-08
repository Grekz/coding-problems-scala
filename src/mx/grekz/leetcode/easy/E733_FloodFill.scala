package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E733_FloodFill {
    def floodFill(image: Array[Array[Int]], sr: Int, sc: Int, newColor: Int): Array[Array[Int]] = {
        var ( n, m, c ) = ( image.length , image(0).length , image(sr)(sc) )
        def dfs( a: Int, b: Int ): Unit = {
            if ( a < 0 || b < 0 || a >= n || b >= m || c != image(a)(b) ) return
            image(a)(b) = newColor
            dfs(a, b+1)
            dfs(a, b-1)
            dfs(a+1, b)
            dfs(a-1, b)
        }
        if ( c != newColor )
            dfs(sr, sc)
        return image
    }
}