package Programming.LogicalBuilding.set2

object OddEvenInArrray extends  App {

  //Read an array and find odd and even number

  var arr = Array(4, 7, 6, 9, 7, 5, 3, 9, 2, 54, 65, 12)

  for (x <- arr) {
    if (x % 2 == 0) {
      print(s"$x is even, ")
    } else {
      print(s"$x is odd, ")
    }
  }

}
