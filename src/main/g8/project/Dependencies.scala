import sbt._

object Dependencies {
	lazy val cats  = "org.typelevel" %% "cats-core" % "2.13.0"
	lazy val munit = "org.scalameta" %% "munit" % "1.2.1" % Test

	lazy val compileDeps = Seq(cats)
	lazy val testDeps    = Seq(munit)
}
