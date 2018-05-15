package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
object E551_StudentAttendanceRecordI {
    def checkRecord(s: String): Boolean = {
        !s.contains("LLL") && s.indexOf("A") == s.lastIndexOf("A")
    }
}