package bleep

import java.nio.file.Path

case class ProjectPaths(dir: Path, targetDir: Path, sourcesDirs: JsonSet[Path], resourcesDirs: JsonSet[Path]) {
  val classes: Path =
    targetDir / "classes"

  val incrementalAnalysis: Path =
    targetDir / s"inc_compile.zip"
}
