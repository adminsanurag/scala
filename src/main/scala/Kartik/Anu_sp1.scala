package Kartik
import org.apache.spark.SparkContext

object Anu_sp1  extends App {

  val sc = new SparkContext("local[*]", "wordcount");
  val input1 = sc.textFile("C:/spahadoop/gutunberg.txt")
  val input2 = input1.flatMap(x => x.split(" "))
  val input3 = input2.map(x => (x, 1))
  val input4 = input3.reduceByKey((x, y) => x + y)
  input4.collect.foreach(println)
  scala.io.StdIn.readLine() //We use this to get the spark UI

}
