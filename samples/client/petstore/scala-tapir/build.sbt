version := "1.0.0"
name := "scala-tapir-petstore"
organization := "org.openapitools"

scalaVersion := "2.13.5"
crossScalaVersions := Seq(scalaVersion.value, "2.12.13")

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % "0.13.0",
  "io.circe" %% "circe-generic" % "0.13.0",
  "io.circe" %% "circe-parser" % "0.13.0",
  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % "0.19.3",
  "com.softwaremill.sttp.tapir" %% "tapir-core" % "0.19.3",
  "com.softwaremill.sttp.tapir" %% "tapir-sttp-client" % "0.19.3",
  "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % "0.19.3"
)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)
