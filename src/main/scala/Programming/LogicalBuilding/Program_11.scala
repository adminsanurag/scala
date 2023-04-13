package Programming.LogicalBuilding
// print odd number between 251 t o51
object Program_11 extends App{
  for (x <- 251 to 51 by -1) {
    if (x % 2 != 0)
      print(s"$x , ")
  }


}
