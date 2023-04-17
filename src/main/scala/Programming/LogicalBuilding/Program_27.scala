package Programming.LogicalBuilding

//  1,2, factor of three, 4,5, factor of three...............................22, 23,factor of three
object Program_27 extends App {

  for(x<-1 to 36)
  {
    if(x%3==0)
    {
      print("factor of three, ")

    }
    else
    {
      print(s"$x, ")
    }
  }

}
