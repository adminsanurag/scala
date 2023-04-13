package Programming.LogicalBuilding

import scala.io.StdIn.readInt

object Switch_program_6  extends App {

  println("enter  first number")
  var i1 :Int= readInt();

  println("enter second number")
  var i2: Int = readInt();

  println("enter symbol")
  var s1: String = readLine()

//switch case start
  val results: String = s1 match { //  switch
    case "*" => s"multiplication of $i1 and  $i2 is ${i1*i2} "
    case "+" => s"sum of $i1 and  $i2 is ${i1+i2} "
    case "-" => s"diffrence from  $i2 and  $i1 is ${i1-i2} "
    case "/" => s"division of $i1 by  $i2 is ${i1/i2} "
    case _ => "Sorry Something went wrong " // Default case
  }
    println(results)




}
