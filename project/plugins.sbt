addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.2.1")
//#sbt-ghpages
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.4")
//#sbt-ghpages

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
