package Spark.Interview

import org.apache.spark.sql

import org.apache.spark.sql.SparkSession
import org.apache.log4j._

//  read text file into single RDD
object ReadTextFiles2 {

  def main(args: Array[String]): Unit ={

    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder().master("local[*]")
      .appName("myApp").getOrCreate()

    val sc = spark.sparkContext
    sc.setLogLevel("Error")
    // note that wholeTextFiles returns an RDD[tuple2]
    // where first value(_1) in tuple is file name and second value (_2) is content of file the file
    val rdd = spark.sparkContext.wholeTextFiles("C:/Spanurag/dataSet/gutunberg.txt")

    rdd.foreach(f=>{println(f._1+"=>"+f._2)})

  }

}



