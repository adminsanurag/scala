package Programming.LogicalBuilding

/*
find avg  24,28... 100
 */
object Program_18 extends App {

  var sum =0;
  var k =0;
  for(x<- 24 to 100 by 2)
  {
    sum= sum+x;
    k=k+1
  }
  var avg :Double = sum/k;
  println("average = "+avg)
}