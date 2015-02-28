import sbtunidoc.Plugin.UnidocKeys._

name := "indoctrinate"

organization in Global := "stew"

lazy val example = project

lazy val docs = project
  .settings(unidocProjectFilter in (ScalaUnidoc, unidoc) := inProjects(example))
  .dependsOn(example)

lazy val indoctrinate = project dependsOn example dependsOn docs


