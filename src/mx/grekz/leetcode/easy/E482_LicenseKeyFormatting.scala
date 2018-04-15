package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E482_LicenseKeyFormatting {

    def licenseKeyFormatting(S: String, K: Int): String = {
        var c = S.replaceAll("-","").toUpperCase()
        var res = ""
        var le = c.length
        if ( le < 1 ) 
            return res
        var s1 = if (le%K==0 )  K  else le%K
        res = c.substring(0, s1)
        while ( le > s1 ) {
            res += "-" + c.substring(s1, s1+K)
            s1 += K
        }
        res
    }
}