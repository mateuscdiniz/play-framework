name := """negocialle"""
organization := "br.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.5"

libraryDependencies += guice
libraryDependencies += javaJdbc

libraryDependencies += "com.h2database" % "h2" % "1.4.192"