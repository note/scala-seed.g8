import sbt._

object Dependencies {
	lazy val cats  = "org.typelevel" %% "cats-core" % "2.9.0"
	lazy val munit = "org.scalameta" %% "munit" % "0.7.29" % Test

	lazy val compileDeps = Seq(cats)
	lazy val testDeps    = Seq(munit)
}
