class Rational(n: Int, d: Int) extends Ordered[Rational] {

 val numer = n
 val denom = d

 def compare(that: Rational) = (this.numer * that.denom) - (that.numer * this.denom)

 override def toString = s"$n/$d"

 def == (that: Rational): Boolean = (this compare that) == 0

}
