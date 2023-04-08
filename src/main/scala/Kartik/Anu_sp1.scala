package Kartik
import org.apache.spark.SparkContext

import org.apache.log4j._

object Anu_sp1  extends App {


  // Set the log level to only print errors
  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext("local[*]", "wordcount");
  val input1 = sc.textFile("C:/Spanurag/dataSet/gutunberg.txt")
  val input2 = input1.flatMap(x => x.split(" "))
  val input3 = input2.map(x => (x, 1))  
  val input4 = input3.reduceByKey((x, y) => x + y)
  input4.collect.foreach(println)
  scala.io.StdIn.readLine() //We use this to get the spark UI00


  sc.stop()
}
