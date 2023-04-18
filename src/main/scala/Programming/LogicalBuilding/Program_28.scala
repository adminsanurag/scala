package Programming.LogicalBuilding
// 1,3, factor of five, 7 , 9 , factor of five
object Program_28 extends App {

  for (x <- 1 to 25) {

    if (x % 2 != 0) {
      if (x % 5 == 0) {
        print("factor of five, ")

      }
      else {
        print(s"$x, ")
      }
    }
  }
}
