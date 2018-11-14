name := "RxScalaGlitch"

version := "1.0"

scalaVersion := "2.12.7"

libraryDependencies += "io.reactivex.rxjava2" % "rxjava" % "2.2.0"

enablePlugins(JavaAppPackaging)
mainClass in Compile := Some("rxjavaglitch.RxJavaGlitch")
