package Programming.LogicalBuilding

/*
10@9, 9@8, 8@7, -5@-6
 */
object Program_21 extends App{

  for(x<- 10 to -5 by -1)
  {
    print(s"$x@${x-1}, ")
  }
} 