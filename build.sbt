import Dependencies._

lazy val hello = taskKey[Unit]("An example task")
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT",
      hello        := { println("Hello ji!") }
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )
