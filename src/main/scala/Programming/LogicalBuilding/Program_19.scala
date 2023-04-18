package Programming.LogicalBuilding

/*
print series  5^2+6^2  ..................  102^2
 */
object Program_19 extends App {
  var sum =0;
  for(x<- 5 to 102)
  {
    sum = sum+ x*x
  }
  println(s"total sum is $sum")
}
