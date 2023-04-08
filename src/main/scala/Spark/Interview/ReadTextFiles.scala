package Spark.Interview
/*

import org.apache.spark.sql

import org.apache.spark.sql.SparkSession
import org.apache.log4j._

//  read text file into single RDD
object ReadTextFiles {

  def main(args: Array[String]): Unit ={

    val spark = SparkSession.builder().master("local[*]")
      .appName("myApp").getOrCreate()

    val sc = spark.sparkContext
    sc.setLogLevel("Error")
    // note that wholeTextFiles returns an RDD[tuple2]
    // where first value(_1) in tuple is file name and second value (_2) is content of file the file
    val rdd = spark.sparkContext.wholeTextFiles("C:/spahadoop/gutunberg.txt")

  }

}



 */