import sbt._

object Dependencies {
	lazy val compileDeps = Seq("org.typelevel" %% "cats-core" % "2.13.0")
	lazy val testDeps    = Seq("org.scalameta" %% "munit" % "1.1.0" % Test)
}
