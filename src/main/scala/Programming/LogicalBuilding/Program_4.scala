package Programming.LogicalBuilding

/*
:- store number in a variable
:- if value not in range(100-1000) prints wrong number else follow the step
:- check odd even
:- if even divide the number by 3 anfd print reminder
:- if odd divide the number 2 and print reminder
 */
import scala.io.StdIn.readInt

object Program_4 extends App{
  println("enter number")
  var i1:Int = readInt()

  if(InRange(i1)== true)
  {
    if(OddEven(i1) == "Odd")
    {
      println("number is odd")
      var result :Int=Remain2(i1)
      println(s"remainder is $result ")
    }
    else
    {
      println("number is even")
      var result :Int=Remain3(i1)
      println(s"remainder is $result ")
    }
  }
  else {
    println("wrong number")
  }
  //  function declaration
  def OddEven( sa :Int): String ={
    if(sa%2==1)
      return "Odd"
    else
      return " Even"
  }

  def InRange(sa: Int): Boolean ={

    if(sa>100 && sa<1000)
    {
      return true
    }
    else
      return false
  }
  def Remain2(sa:Int):Int ={

    var out:Int = sa%2
    return out
  }

  def Remain3(sa:Int):Int ={

    var out:Int = sa%3
    return out
  }

}

