package Programming.LogicalBuilding
// print 5*4, 5*3 ..................  5*-12
object Program_25 extends  App{
  println("series 1")
  for(x <- 4 to -12 by -1)
    {
      print(s"5*$x,")
    }

  println("\nseries 2")
  for (x <- 4 to -12 by -1) {
    print(s"${5*x},")
  }


}
