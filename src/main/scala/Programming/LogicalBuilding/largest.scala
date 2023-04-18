package Programming.LogicalBuilding.set2

object largest extends App{

 // Find the largest number if someone have provided you 10 numbers
// (10,40,50,70,90,20,44,42,37,80)

   var l=List(10,40,50,70,90,20,44,42,37,80)

  var lar= l(0)
   for (x<-l )
    {
      if(x>lar)
        {
          lar =x
        }
    }

  println(s" largest $lar")
}
