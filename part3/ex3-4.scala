def drop[A](l : List[A], n : Int) : List[A] = {
  @annotation.tailrec
  def loop[A](i : Int, lx : List[A]) : List[A] = {
    if(i >= n) lx
    else {
      lx match {
      case Nil => Nil
      case Cons(_, t) => loop(i+1, t)
      }
    }
  }
  loop(0, l)
}

def testDrop() : Unit = {
  println(s"drop(List(1,2,3) 0) == List(1,2,3) ${drop(List(1,2,3), 0) == List(1,2,3)}")
  println(s"drop(List(1,2,3,4,5), 3) == List(4,5) ${drop(List(1,2,3,4,5), 3) == List(4,5)}")
  println(s"drop(List(a,b,c), 5) == Nil ${drop(List("a","b","c"), 5) == Nil}")
}
