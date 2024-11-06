import scala.io.Source

// Define global variables
final val filePath = "./res/hospital_assignment.csv"
// Define storage for Hospital Data
var hospitalData: List[List[String]] = List()

// Function to read CSV and count records
def readCSV(): List[List[String]] = {
  // Open the CSV file
  val bufferedSource = Source.fromFile(filePath)
  var data: List[List[String]] = List()
  var count = 0

  // read each line, dropping the header
  for (line <- bufferedSource.getLines().drop(1)) { // Drop header line
    val cols = line.split(",").map(_.trim).toList
    data = data :+ cols
    count += 1
  }

  bufferedSource.close()
  println(s"Total amount of hospitals in the file: $count")
  data
}

// Main function to run the program
@main def main(): Unit = {
  // Load data from CSV into global hospitalData
  hospitalData = readCSV()

  //sort the hospital data into
}
