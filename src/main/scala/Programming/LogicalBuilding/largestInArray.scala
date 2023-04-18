package Programming.LogicalBuilding.set2

object largestInArray extends App {


  var arr= Array(4,7,6,9,7,5,3,9,2,54,65,12)
  var k =arr(0)
  for(x<-arr)
    {
      if(x>k)
        {
          k=x
        }


    }
  println(s"largest number in array is $k")
}
