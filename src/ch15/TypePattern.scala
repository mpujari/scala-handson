def isStringArray(x: Any) = x match {
 case a: Array[String] => "yes"
 case _ => "no"
}

var x = isStringArray(Array("a", "b"))
println(x)

x = isStringArray(Array(1, 2))
println(x)
