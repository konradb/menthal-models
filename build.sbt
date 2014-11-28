name := "menthal-models"

version := "0.1"

scalaVersion := "2.10.4"

scalacOptions in (Compile,doc) ++= Seq("-groups", "-implicits")

Seq( sbtavro.SbtAvro.avroSettings : _*)

(sourceDirectory in avroConfig) := new java.io.File("model/avro")

(stringType in avroConfig) := "String"

//libraryDependencies += "org.scalatest" %% "scalatest" % "2.0" % "test" //Testing

//addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

//libraryDependencies ++= Seq( //Dates and Times
//  "org.joda" % "joda-convert" % "1.6"
//  ,"joda-time" % "joda-time" % "2.3"
//)


