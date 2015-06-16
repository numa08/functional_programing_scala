object Ex2_1 {

  def fib(n : Int) : Int = {
    @annotation.tailrec
    def loop(i : Int, l : List[Int]) : List[Int] ={
      if(i == 0) loop(1, 0 :: Nil)
      else if(i == 1) loop(2, 1 :: 0 :: Nil)
      else if(i > n) l
      else loop(i + 1, (l(0) + l(1)) :: l)
    }
    val fibs = loop(0, Nil)
    fibs(0) + fibs(1)
  }

  def main(args: Array[String]) : Unit = {
    println(s"fib 0 ${fib(0)}")
    println(s"fib 1 ${fib(1)}")
    println(s"fib 5 ${fib(5)}")
  }
}
