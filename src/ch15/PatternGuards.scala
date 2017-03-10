abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

def simplyAdd(e: Expr) = e match {
 case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
 case _ => e
}

var x = simplyAdd(BinOp("*", Number(3), Number(3)))
println(x)

x = simplyAdd(BinOp("+", Number(3), Number(3)))
println(x)
