package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E290_WordPattern {
    def wordPattern(pattern: String, str: String): Boolean = {
        var arr = str.split(" ")
        if (pattern.length() != arr.length) 
            return false
        var map  = new scala.collection.mutable.HashMap[Char,String]()
        for((c, i) <- pattern.zipWithIndex){
            var s = arr(i)
            if ( map.contains(c) ){
                if ( !map(c).equals(s) ) return false
            }else{
                if ( map.values.exists(_ == s) ) return false
                map.update(c,s)
            }
        }
        return true;
    }
}