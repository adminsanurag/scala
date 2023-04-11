package Programming.OPPConcept


/*
Novel and Wiriter
Writer: first name, surname , year
-method fullname

Novel: name, year of relaese ,author
-authorAge
-isWrittenBy(author)
-copy(new year of release) = new instance of Novel


*/

object OOBasic2Novel  extends App {

  val author = new Writer("Charles","Dickens" ,1812)
  val imposter = new Writer("Charles","Dickens" ,1812)
  val novel = new Novel("Great Expections",1861,author)




  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter


}



class Writer(firstname: String, surname: String, val year:Int) {
  def fullName: String =firstname  + " " + surname
}

class Novel(name: String, year: Int, author :Writer){
  def authorAge =year - author.year
  def isWrittenBy(author:Writer) = author == this.author
  def copy(newYear:Int) : Novel = new Novel(name, newYear, author)

}
/*
Counter class
recevies an int value
-method current count
-method to increment/ decement => new Counter
- overload inc/dec to rececive an amount
 */


class Counter (val count: Int= 0){
  def inc = {
    println("incremental ")
    new Counter(count + 1)

  } // immutabilty
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }
  def inc(n:Int) : Counter = {
    if(n<= 0 ) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)



  }
}