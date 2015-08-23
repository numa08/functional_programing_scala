def init[A](l : List[A]): List[A] = {
  def loop(l1: List[A], l2: List[A]) : List[A] = {
    l1 match {
      case Cons(_, Nil) => l2
      case Cons(h, t) => Cons(h, loop(t, l2))
      case Nil => l2
    }
  }
  loop(l, Nil)
}

def testInit() : Unit = {
  println(s"init(List(1,2,3,4,5)) ${init(List(1,2,3,4,5)) == List(1,2,3,4)}")
}
