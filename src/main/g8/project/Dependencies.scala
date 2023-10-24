import sbt._

object Dependencies {
	lazy val compileDeps = Seq("org.typelevel" %% "cats-core" % "2.10.0")
	lazy val testDeps    = Seq("org.scalameta" %% "munit" % "0.7.29" % Test)
}
