import java.io.File

def fileMatching(query: String, matcher: (String, String) => Boolean ) = {
  def filesHere = (new File(".")).listFiles
  // filesHere.foreach(println _)
  for(file <- filesHere; if matcher(file.getName, query))
    yield file
}

def filesEnding(query: String) = fileMatching(query, _.endsWith(_))

def filesContaining(query: String) = fileMatching(query, _.contains(_))

def filesMatches(query: String) = fileMatching(query, _.matches(_))

println("\nEnding with:\n")
filesEnding("01.scala").foreach(println _)

println("\n\nContains:\n")
filesContaining("01").foreach(println _)

println("\n\nMatches:\n")
filesMatches(".*01.*").foreach(println _)