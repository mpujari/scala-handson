abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


def varMatch(x: Any) = x match {
 case UnOp("abs", e @ UnOp("abs", _)) => e
 case UnOp("abs", _) => "Matched" 
 case _ => "nill"
}

var x1 = varMatch("dd")
println(x1)

x1 = varMatch(UnOp("abs", Var("ddddddd")))
println(x1)
