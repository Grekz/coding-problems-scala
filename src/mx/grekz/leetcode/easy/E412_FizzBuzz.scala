package mx.grekz.leetcode.easy

object E412_FizzBuzz {
    def fizzBuzz(n: Int): List[String] = 
        ( 1 to n ).map( i => {
                if (i % 3 == 0 && i % 5 == 0) {
                    "FizzBuzz"
                } else if (i % 3 == 0) {
                    "Fizz"
                } else if (i % 5 == 0) {
                    "Buzz"
                } else {
                    i.toString
                } 
            } 
        ).toList
}