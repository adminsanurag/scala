package Spark.FrankCane

import org.apache.spark.SparkContext
import org.apache.log4j._


object RatingCounter {

  def main(arg: Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val sc = new SparkContext(master = "local[*]", appName = "RatingCounter")
    val lines = sc.textFile("C:/Spanurag/dataSet/ml-100k/u.data")
    val rating = lines.map(x => x.split("\t")(2))
    val results = rating.countByValue()
    val sortedResults = results.toSeq.sortBy(_._1)
    //sortedResults.foreach(println)


    //org.apache.log4j.Logger.setLe
  }

}
