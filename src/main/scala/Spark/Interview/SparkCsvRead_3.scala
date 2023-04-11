package Spark.Interview
import org.apache.spark.sql.SparkSession
import org.apache.log4j._

//import org.apache.spark.api.java.JavaSparkContext.fromSparkContext


object SparkCsvRead_3 {

  def main(args:Array[String]):Unit ={

    val spark= SparkSession.builder().appName("MyTest").master("local").getOrCreate()
    val sc =spark.sparkContext


sc.setLogLevel("ERROR")

    Logger.getLogger("org").setLevel(Level.ERROR)

    // option1 reading into Dataframe
    val csvFolder = spark.read.option("header","true")
                              .option("inferSchema","true")
                              .csv("C:/Spanurag/dataSet/classicmodel/office.csv" )
    csvFolder.show(5,false)
    csvFolder.printSchema()

    println("*******************************************************************************************")

    //option 1 reading into rdd

    val csvMethod2 = sc.textFile("C:/Spanurag/dataSet/classicmodel/office.csv")
    csvMethod2.take(5).foreach(f=>{println(f)})

  }

}
