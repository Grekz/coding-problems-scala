package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E929_UniqueEmailAddresses {
    def numUniqueEmails(emails: Array[String]): Int = {
        var set = scala.collection.mutable.Set[String]()
        for ( e <- emails ) {
            var parts = e.split("[@+]")
            var a = parts(0).replaceAll(".","")
            set.add(a+parts.last)
        }
        set.size
    }
}