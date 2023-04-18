package Programming.LogicalBuilding
//  1,even,3,even, 5,even............ 35,even
object Program_26 extends App {

for(x<-1 to 36)
  {
    if(x%2==0)
      {
        print("even, ")

      }
    else
      {
        print(s"$x, ")
      }
  }

}
