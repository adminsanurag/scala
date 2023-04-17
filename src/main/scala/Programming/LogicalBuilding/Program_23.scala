package Programming.LogicalBuilding
// Print Series 5^2, 7^2 9^2,25^2
object Program_23 extends App {


  for(x <- 5 to 25 by 1)
    {
      if(x%2!=0)
        {
          print(s"$x^2, ")
        }
    }


}
