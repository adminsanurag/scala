package Programming.LogicalBuilding

import scala.io.StdIn.readInt

object TemperatureCtoF_2 extends App {
  print("enter Temperature in Celsius \n")
  var cal = readInt()
  var fah: Double = (cal * 9 / 5) + 32

  //  f"Value of x is $x%.2f"



  println(f"$cal C celius in  fahrenheit is  $fah%.2f F  ")

}