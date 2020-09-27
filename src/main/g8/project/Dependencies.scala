import sbt._

object Dependencies {
	lazy val cats = "org.typelevel" %% "cats-core" % "2.2.0"
	lazy val munit = "org.scalameta" %% "munit" % "0.7.12" % Test

	lazy val all = Seq(
		cats,
		munit
	)
}
