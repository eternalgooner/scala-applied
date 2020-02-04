//not used much in Production - most likely to use java NIO
//good for demos & learning

import scala.io.Source

val filePath = "/Users/mackessyd/IdeaProjects/ScalaApplied/src/main/scala/fileIO/fileIO.txt"

for (line <- Source.fromFile(filePath).getLines()){
  println(line)
}
