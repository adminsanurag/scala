package Programming.BasicProgram

object Functions extends App {


    println("Funtions")
    def aFunction(a: String, b: Int): String = {
      a + "  " + b
    }

    print(aFunction("Anurag", 7))

    def aParameterlessfunction(): Int = 42

    println(aParameterlessfunction())


    def RepeatedFunction(aString: String, n: Int): String = {


      if (n == 1) aString

      else aString + RepeatedFunction(aString, n - 1)

    }

    println(RepeatedFunction("Anurag ", 4))





    // functional programmming : use recursion instead of loop


    def aFunctionalWithSideEffects(aString: String): Unit = println(aString)





    //auxially Function


    def aBigFunction(n: Int): Int = {
      def aSmallerFunction(a: Int, b: Int): Int = a + b
      aSmallerFunction(n, n - 1)
    }

}
