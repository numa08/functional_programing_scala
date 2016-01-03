def startWith[A](l: List[A], pre: List[A]) : Boolean = (l, pre) match {
  case (_, Nil) => true
  case (Cons(h1, t1), Cons(h2, t2)) if h1 == h2 => startWith(t1, t2)
  case _ => false
}


def hasSubsequence[A](sup: List[A], seq: List[A]) : Boolean = sup match {
  case Nil => false
  case _ if startWith(sup, seq) => true
  case Cons(_, t) => hasSubsequence(t, seq)
}

def test() = {
  val l = List(1,2,3,4)
  println(s"List(1,2,3,4) hasSubsequence List(1,2,3) ${hasSubsequence(l, List(1,2,3))}")
  println(s"List(1,2,3,4) hasSubsequence List(2,3) ${hasSubsequence(l, List(2,3))}")
  println(s"List(1,2,3,4) hasSubsequence List(4) ${hasSubsequence(l, List(4))}")
}
