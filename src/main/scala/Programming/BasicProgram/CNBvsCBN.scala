package Programming.BasicProgram


object CNBvsCBN extends App {

  // call by name, call by value


  def  calledByValue(x: Long): Unit ={  //363249803255300  is passed
    println("by value :" + x)
    println(" by value: " +x)
  }
  def  calledByName(x: =>  Long): Unit ={  //System.nanoTime()  is passed
    println("by name :" + x)
    println(" by name: " +x)



  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


}