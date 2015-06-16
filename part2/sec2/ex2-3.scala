object Ex2_3 {

  def curry[A, B, C](f:(A ,B) => C) : A => (B => C) = {
    (a : A) => (b : B) => f(a, b)
  }

  def main(args : Array[String]) : Unit = {
    val add = (x : Int, y : Int) => x + y
    val add1 = curry(add)(1)
    val c = add1(2) == 3
    println(s"c is 3 ? ${c}")
  }
}
