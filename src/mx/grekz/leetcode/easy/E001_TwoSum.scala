package mx.grekz.leetcode.easy

object E001_TwoSum {
    def twoSum( nums: Array[ Int ], target: Int ): Array[ Int ] = {
        var i = 0
        var tmp = Map[ Int, Int ]()
        nums.foreach {
            ( x: Int ) =>
                var rest: Int = target - x
                if ( tmp contains rest ) {
                    return Array( tmp( rest ), i )
                }
                tmp += ( x -> i )
                i += 1
        }
        return Array( 0, 0 )
    }
}