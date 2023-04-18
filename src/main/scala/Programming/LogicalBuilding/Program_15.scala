package Programming.LogicalBuilding

/*
Print series

(2*3, 3*4 ....................................16*17
 */
object Program_15 extends  App{
  println("series 1 -> A*B , B*C")
  for(x <- 2 to 16)
  {
    print(s" $x*${x+1}," )
  }

  println("series 2 -> AB , BC")
  for(x <- 2 to 16)
  {
    print(s" ${(x+1)*x}," )
  }

}