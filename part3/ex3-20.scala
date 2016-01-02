def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = List.foldRight(as, List[B]())((a, l) => List.append(f(a), l))

def test() {
  val l = List(1,2,3)
  val f = (i: Int) => List(i, i)

  println(s"flatMap(List(1,2,3)(_ => List(_,_))) = ${flatMap(l)(f)}")
}
