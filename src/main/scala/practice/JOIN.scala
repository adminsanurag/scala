package practice

import org.apache.spark.sql

import org.apache.spark.sql.SparkSession
import org.apache.log4j._

object JOIN {


  def main(args: Array[String]): Unit = {

    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("myApp")
      .getOrCreate()

    val sc = spark.sparkContext
    val data = List(1, 2, 3, 4, 5)
    val rdd1 = sc.parallelize(data)

    //-------------------------------Join rdd---------------------
    println("Join")
    val rddj1 = sc.parallelize(Array((1, "apple"), (2, "banana"), (3,
      "orange")))
    val rddj2 = sc.parallelize(Array((1, "red"), (2, "yellow"), (4,
      "green")))
    println("inner join")
    val joinedRddj_join = rddj1.join(rddj2)
    joinedRddj_join.foreach(println)

    println("left join")
    val joinedRddj_left_join = rddj1.leftOuterJoin(rddj2)
    joinedRddj_left_join.foreach(println)

    println("right join")
    val joinedRddj_right_join = rddj1.leftOuterJoin(rddj2)
    joinedRddj_right_join.foreach(println)



  }
}
