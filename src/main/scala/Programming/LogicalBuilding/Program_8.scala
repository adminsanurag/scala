package Programming.LogicalBuilding
// print number divisible by 11 between 250 to 500
object Program_8 extends App{


  for(x<- 250 to 500)
    {
      if(x%11==0)
        print(s"$x , ")
    }

}
