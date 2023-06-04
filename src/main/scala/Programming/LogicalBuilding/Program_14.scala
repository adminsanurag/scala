package Programming.LogicalBuilding
// print aleternative even number  ex:- 22 ,26,30
object Program_14 extends App{


  var counter1 = 0
  for (x <- 20 to 140 by 1) {
    if (x % 2 == 0) {
      counter1 = counter1 + 1
      if (counter1 % 2 == 0) {
        print(s"$x , ")
      }
    }
  }
}