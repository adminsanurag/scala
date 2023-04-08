package Programming.BasicProgram


object Recursion extends App {

  def anotherFactorial(n : Int): BigInt ={


    //@tailrec
    def factHelper(x : Int, accumulator : BigInt): BigInt=
      if (x <=1) accumulator
      else factHelper(x-1,x*accumulator)   // tail recursion= use recursive code as last expression

    factHelper(n, 1)
  }
  // when you need loop use tail recursion
  println(anotherFactorial(956))

  def concattail(aString : String, n: Int,accumulator : String): String =
    if(n<=0) accumulator
    else concattail(aString,n-1,aString+accumulator)


  println(concattail("hello " ,3, ""))


  def isPrime(n : Int): Boolean ={
    //@tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean=
      if(!isStillPrime) false
      else if(t<=1) true
      else isPrimeTailrec(t-1,n %t !=0 && isStillPrime)
    isPrimeTailrec(n/2,true)

  }

  println("5 is prime number "+isPrime(5))



  def fibonacci(n:Int): Int={
    def fiboTailrec(i : Int, last: Int, nextToLast : Int): Int =
      if (i >=n) last
      else fiboTailrec(i +1 , last + nextToLast, last)

    if(n<=2) 1
    else fiboTailrec(2,1,1)

  }
  println("fibo   "+fibonacci(8))
}
