name := "MockTest"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
   "org.scalamock" %% "scalamock-scalatest-support" % "3.5.0",
   "org.mockito" % "mockito-core" % "2.7.22",
   "org.scalatest" %% "scalatest" % "3.0.1" % "test",
   "net.codingwell" %% "scala-guice" % "4.1.0"
)