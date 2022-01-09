version := "1.0.0"
name := "scala-tapir-petstore"
organization := "org.openapitools"

scalaVersion := "2.13.5"
crossScalaVersions := Seq(scalaVersion.value, "2.12.13")

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "3.6.11",
  "com.softwaremill.sttp.tapir" %% "tapir-core" % "0.19.3"
)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)
