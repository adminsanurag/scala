package Programming.LogicalBuilding

/*
    print varibale using ASCII code
 */
object Program_17 extends App{
  println("lowercase")
  for(x <- 97 to 122 by 1 )
  {
    print(x.toChar+", ")
  }
  println("\n UpperCase")
  for(x <- 65 to 65+25 by 1 )
  {
    print(x.toChar+", ")
  }
} 