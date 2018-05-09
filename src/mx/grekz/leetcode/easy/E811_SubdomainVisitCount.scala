package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E811_SubdomainVisitCount {
    def subdomainVisits(cpdomains: Array[String]): List[String] = {
        var tmp = collection.mutable.Map[String, Int]()
        for ( dom <- cpdomains ) {
            var cur = dom.split(" ")
            var count = cur(0).toInt
            var sd = cur(1)
            var idx = sd.indexOf(".")
            tmp(sd) = tmp.getOrElse(sd, 0) + count
            while ( idx > -1 ) {
                sd = sd.substring(idx + 1)
                tmp(sd) = tmp.getOrElse(sd, 0) + count
                idx = sd.indexOf(".")
            }
        }
        var res = List[String]()
        for ( (k, v) <- tmp ) {
            res :+= v.toString + " " + k
        }
        res 
    }
}