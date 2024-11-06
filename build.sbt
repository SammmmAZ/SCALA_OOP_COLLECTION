libraryDependencies ++= Seq(
  "org.apache.poi" % "poi-ooxml" % "5.2.3",
  "org.apache.poi" % "poi" % "5.2.3"
)


ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "Assignment_2"
  )
