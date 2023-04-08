package Programming.BasicProgram


object StringsOps   extends App {

  val str ="Hello, I am learning Scala"

  //println(str.chartAt(2))
  println(str.substring(7,11))

  println(str.split(" ").toList)

  println(str.startsWith("Hello"))

  println(str.replace("  ","-"))

  println(str.toLowerCase())

  print(str.length())


  val aNumberString= "45"

  val Number =aNumberString.toInt

  println('a' +: aNumberString  :+'z')

  print(str.reverse)


}