package Programming.LogicalBuilding

// count number of even betwwen range
import scala.io.StdIn.readInt
object Program_12 extends App{
  println("enter starting range")
  var i1: Int=readInt()

  println("enter end range")
  var i2: Int = readInt()
  var counter=0
  for (x <- i1 to i2 by 1) {
    if (x % 2 == 0)
      counter =counter +1
  }

println(s"total of even number is $counter")

}