def tail[A](list: List[A]) : List[A] = list match {
  case Nil => Nil
  case Cons(_, t) => t
}

def testTail() : Unit = {
  println(s"tail(Nil) ==  Nil ${tail(Nil) == Nil}")
  println(s"tail(List(1,2,3,4,5)) == List(2,3,4,5) ${tail(List(1,2,3,4,5)) == List(2,3,4,5)}")
}
