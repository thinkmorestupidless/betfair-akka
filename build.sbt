name := "betfair-akka"
organization := "cc.xuloo"
version := "0.1"

scalaVersion := "2.11.8"

EclipseKeys.projectFlavor in Global := EclipseProjectFlavor.Java

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.5",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.9.2",
  "org.projectlombok" % "lombok" % "1.16.10",
  "joda-time" % "joda-time" % "2.9.3" % "compile",
  "com.opengamma.strata" % "strata-collect" % "1.4.2",
  "com.google.guava" % "guava" % "21.0",
  "org.asynchttpclient" % "async-http-client" % "2.0.37",
  "com.typesafe.akka" %% "akka-actor" % "2.5.8",
  "junit" % "junit" % "4.12" % "test",
  "org.assertj" % "assertj-core" % "3.8.0" % "test"
)


