name := "reactive-stream-adapters"

organization := "reactiveplatform.xyz"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.5.9",
  "io.reactivex.rxjava2" % "rxjava" % "2.1.9",
  "io.projectreactor" % "reactor-core" % "3.1.3.RELEASE"
)