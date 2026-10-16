ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.0"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-template",
    idePackagePrefix := Some("edu.udg.pda"),
    libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % "2.6.21",
    "org.slf4j" % "slf4j-simple" % "2.0.16")
  )
