package Programming.LogicalBuilding.set2
/*
)find the palindromes for a given range of input
 */


import scala.io.StdIn.readInt

object Palindrome extends App{

  var i1:Int = readInt()

  for(x<- 1 to i1)
    {
      if(x==Reverse(x))
        {
          print(s"$x, ")
        }
    }

  def Reverse(x:Int):Int =
    {
      var temp:Int = x
      var pal:Int =0
      while(0<temp)
        {
          var k=temp%10
          pal= pal*10+ k

          temp = temp/10
        }
        return pal
    }


}
