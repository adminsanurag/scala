package Spark.DataFrames1

package Spark.DataFrames1
import org.apache.spark._
import org.apache.log4j._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.SparkSession
object Sunday_week1 {

  def main(args: Array[String]): Unit = {

    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder().master("local[*]")
      .appName("myApp").getOrCreate()
    import spark.implicits._


    val sc = spark.sparkContext
    sc.setLogLevel("Error")



   // Finding the average rating for each movie and the total number of ratingsfor each movie
    val ratingsData = Seq(
      ("User1", "Movie1", 4.5),
      ("User2", "Movie1", 3.5),
      ("User3", "Movie2", 2.5),
      ("User4", "Movie2", 3.0),
      ("User1", "Movie3", 5.0),
      ("User2", "Movie3", 4.0)
    ).toDF("User", "Movie", "Rating")


    val avgrating = ratingsData.groupBy("Movie").avg("Rating")
    ratingsData.show()
    avgrating.show()

  }
}
