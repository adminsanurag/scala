package Programming.LogicalBuilding

/*
sum of all even number between 382 to 582
 */
object Program_16  extends  App{

  var sum =0
  for(x<-382 to 582 by 1 )
  {
    if(x%2==0)
    {
      sum=sum+x
    }
  }
  print(s"Total sum = $sum")

}
