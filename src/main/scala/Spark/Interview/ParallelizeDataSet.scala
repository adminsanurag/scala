package Spark.Interview

import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.SparkContext

object ParallelizeDataSet {

// Create aSpark RDD using Parallelize


  def main(args: Array[String]): Unit= {

    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

   // val sc = new SparkContext("local[*]","wordcount");
 val spark =SparkSession.builder().master("local[*]").appName("myapp").getOrCreate()
    val sc =spark.sparkContext

    val rdd=sc.parallelize(List(1,2,3,4))
    val partition =rdd.getNumPartitions
    println(s"Number. of Partion of rdd $partition")

    val first =rdd.first()
    println(s"first element of rdd $first")


  }

}

