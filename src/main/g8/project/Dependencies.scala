import sbt._

object Dependencies {
	lazy val cats = "org.typelevel" %% "cats-core" % "2.2.0"
	lazy val scalatest = "org.scalatest" %% "scalatest" % "3.2.2" % Test
}
