def init[A](l : List[A]) : List[A] = {
  def loop(nl : List[A], ll : List[A]) : List[A] = ll match {
    case Cons(h, Nil) => nl
    case Cons(h, t) => loop(List.append(nl, List(h)),t)
    case Nil => nl
  }
  loop(Nil, l)
}

def testInit() : Unit = {
  println(s"init(List(1,2,3,4)) == List(1,2,3) ${init(List(1,2,3,4)) == List(1,2,3)}")
}
