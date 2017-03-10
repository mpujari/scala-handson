def generalSize(x: Any) = x match {
 case s: String => s.length
 case m: Map[_, _] => m.size
 case _ => -1
}

val x1 = generalSize("e")
println(x1)

val x2 = generalSize(Map(1 -> 9, 3 -> 5))
println(x2)

val x3 = generalSize(null)
println(x3)
