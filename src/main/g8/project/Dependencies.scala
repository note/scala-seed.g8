import sbt._

object Dependencies {
	lazy val cats = "org.typelevel" %% "cats-core" % "2.1.1"
	lazy val scalatest = "org.scalatest" %% "scalatest" % "3.1.0" % Test
}
