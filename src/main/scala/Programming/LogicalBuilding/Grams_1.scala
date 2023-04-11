package Programming.LogicalBuilding

import scala.io.StdIn.readInt

object Grams_1  extends App {
  print("enter kg \n")
  var kg = readInt()
  var g: Int = kg*1000

  println(s"$kg in gram is equal to $g")
}