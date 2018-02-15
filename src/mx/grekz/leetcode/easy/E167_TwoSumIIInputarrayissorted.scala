package mx.grekz.leetcode.easy

object E167_TwoSumIIInputarrayissorted {
  
    def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
        var i = 0
        var j = numbers.length - 1
        while ( i < j ){
            var sum = numbers(i) + numbers(j)
            if ( sum < target ) 
                i+=1
            else if ( sum > target )
                j-=1
            else
                return Array(i+1,j+1)   
        }
        return Array(-1,-1)
    }
}