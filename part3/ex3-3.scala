def setHead[A](list : List[A], head : A) : List[A] = list match {
  case Nil => List(head)
  case Cons(_, t) => Cons(head, t)
}

def testSetHead() : Unit = {
  println(s"setHead(Nil, 1) == List(1) ${setHead(Nil, 1) == List(1)}")
  println(s"setHead(List(a, b, c), z) == List(z, b, c) ${setHead(List("a", "b", "c"), "z") == List("z", "b", "c")}")
}
