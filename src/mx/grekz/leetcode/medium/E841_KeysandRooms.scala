package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
object E841_KeysandRooms {
    def canVisitAllRooms(rooms: List[List[Int]]): Boolean = {
        var seen = Array.fill(rooms.size)(false)
        var stack = scala.collection.mutable.Stack[Int]()
        stack.push(0)
        seen(0) = true
        while ( !stack.isEmpty ) {
            var cur = stack.pop()
            for ( x <- rooms(cur) ) {
                if ( !seen(x) ) {
                    seen(x) = true
                    stack.push(x)
                }
            }
        }
        return !seen.contains(false)
    }
}