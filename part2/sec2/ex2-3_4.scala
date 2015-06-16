object Ex2_3_4 {

  def curry[A, B, C](f:(A ,B) => C) : A => (B => C) = {
    (a : A) => (b : B) => f(a, b)
  }

  def uncurry[A, B, C](f : A => B => C) : (A, B) => C = {
    (a : A, b : B) => f(a)(b)
  }

  def main(args : Array[String]) : Unit = {
    val add = (x : Int, y : Int) => x + y
    val curried = curry(add)
    val add1 = curried(1)
    val c = add1(2) == 3
    println(s"c is 3 ? ${c}")

    val uncurried = uncurry(curried)
    val c_1 = uncurried(1, 2) == 3
    println(s"c_1 is 3 ? ${c_1}")
  }
}
