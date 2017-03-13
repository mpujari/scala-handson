object SimplePatternMatch extends App {

 val x: Any = 10
 x match {
  case t1 : String => { println("ten String") }
  case t2 : Int => { println("ten Int") }
  case _ =>  { println("Unknown") }
 }

// println(y(3))
}
