import com.softwaremill.SbtSoftwareMill.autoImport.{commonSmlBuildSettings, ossPublishSettings, wartRemoverSettings}
import org.scalafmt.sbt.ScalafmtPlugin.autoImport.scalafmtOnCompile
import sbt.Keys.{name, organization, scalaVersion, version}
import sbt.Project

object Common {
  implicit class ProjectFrom(project: Project) {
    def commonSettings(nameArg: String, versionArg: String): Project = project.settings(
      name := nameArg,
      organization := "$organization$",
      version := versionArg,

      scalaVersion := "2.13.2",
      scalafmtOnCompile := true,

      commonSmlBuildSettings,
      wartRemoverSettings
    )
  }
}