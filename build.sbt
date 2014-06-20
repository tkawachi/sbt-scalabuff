sbtPlugin := true

name := "sbt-scalabuff"

version := "1.3.8"

organization := "com.github.tkawachi"

crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.12", "0.13")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
