import com.softwaremill.SbtSoftwareMillCommon.autoImport.commonSmlBuildSettings
import org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile
import sbt.Keys.{name, organization, scalaVersion, testFrameworks, version}
import sbt.{Project, TestFramework}

object Common {
  implicit class ProjectFrom(project: Project) {
    def commonSettings(nameArg: String, versionArg: String): Project = project.settings(
      name := nameArg,
      organization := "$organization$",
      version := versionArg,

      scalaVersion := "2.13.3",
      scalafmtOnCompile := true,

      commonSmlBuildSettings,
      scalacOptions += "-Ymacro-annotations",
      testFrameworks += new TestFramework("munit.Framework")
    )
  }
}
