import sbt._

object Dependencies {
	lazy val cats  = "org.typelevel" %% "cats-core" % "2.5.0"
	lazy val munit = "org.scalameta" %% "munit" % "0.7.23" % Test

	lazy val compileDeps = Seq(cats)
	lazy val testDeps    = Seq(munit)
}
