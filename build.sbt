

name:= "scalatesting"

version := "1.0"

scalaVersion := "2.11.8"


scalacOptions ++= List(
  "-unchecked",
  "-deprecation"
) 

// Resolvers
resolvers ++= Seq(
)

// Dependencies
val testDependencies = Seq (
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.4.16",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.16"
)

val rootDependencies = Seq(
"com.typesafe.akka"          %%    "akka-stream-kafka"             % "0.13",
"com.typesafe.scala-logging" %%   "scala-logging-slf4j"           %  "2.1.2",
"com.typesafe.akka"          %%   "akka-actor"                    %  "2.4.16",
"com.typesafe.akka"          %%   "akka-stream"                   %  "2.4.16",
"io.argonaut"                %%   "argonaut"                      %  "6.1"
)

libraryDependencies ++= testDependencies ++ rootDependencies


