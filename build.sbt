import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "JSoup Bug 1802 repro",
    libraryDependencies += scalaTest % Test,
    assembly / mainClass := Some("example.Hello")
  )

libraryDependencies ++= Seq(
  "org.jsoup"                                % "jsoup"                     % "1.15.2"
)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
