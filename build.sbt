name := "skeleton"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

coverageMinimum := 80
coverageEnabled := true
coverageFailOnMinimum := false
coverageHighlighting := true
