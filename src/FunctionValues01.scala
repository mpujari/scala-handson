import java.io.File

def fileMatching(query: String, matcher: (String, String) => Boolean ) = {
  def filesHere = (new File(".")).listFiles
  // filesHere.foreach(println _)
  for(file <- filesHere; if matcher(file.getName, query))
    yield file
}

def filesEnding(query: String) = fileMatching(query, _.endsWith(_))

filesEnding("01.scala").foreach(println _)