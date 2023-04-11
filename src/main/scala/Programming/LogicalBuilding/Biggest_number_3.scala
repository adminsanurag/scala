package Programming.LogicalBuilding

import scala.io.StdIn.readInt
object Biggest_number_3 extends App {
  println("enter first number")
  var i1:Int = readInt()
  println("enter second number")
  var i2:Int = readInt()
  println("enter third number")
  var i3:Int = readInt()

  if (i1 > i2) {
    if (i1 > i3) {
      println(s" $i1 is biggest number")
    }
    else {
      println(s"$i3 is biggest number")
    }
  }
  else if(i2 > i3 ) {
    println(s"$i2 is biggest number ")
  }
  else
  {
    println(s"$i3 is biggest number")
  }

}

