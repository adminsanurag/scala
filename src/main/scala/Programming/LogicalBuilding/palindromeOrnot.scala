package Programming.LogicalBuilding.set2
/*
read and array of numbers and find whether given numbers are palindromes or not 
and print if number is not palindrome print it is not palindrome, and print palindrome if it is palindrome
 */
object palindromeOrnot  extends App {

  var arr =Array(675,444,565,788,122,1221)

  for(x<-arr)
    {
      if (x == Reverse(x)) {
        println(s"$x is palindrome ")
      }else{
        println(s"$x is  not palindrome ")
      }
    }


  def Reverse(x: Int): Int = {
    var temp: Int = x
    var pal: Int = 0
    while (0 < temp) {
      var k = temp % 10
      pal = pal * 10 + k

      temp = temp / 10
    }
    return pal
  }

}
