object Ex2_5 {

  def compose[A, B, C](f : B => C, g : A => B) : A => C = {
    (a : A) => f(g(a))
  }

  def main(args : Array[String]) : Unit = {
    val g = (x : Int) => x + 5
    val f = (x : Int) => x + 10
    val com = compose(f, g)
    val sum = com(2)
    println(s"sum(2) is 17 ? ${sum == 17}")
  }
}
