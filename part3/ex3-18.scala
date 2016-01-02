def map[A, B](as: List[A])(f: A => B): List[B] = List.foldRight(as, List[B]())((a, l) => Cons(f(a), l))

def test() {
  val l = List(1, 2, 3, 4, 5)
  val f = (a: Int) => a * 2
  println(s"map(List(1,2,3,4,5), (a: Int) => a * 2) = ${map(l)(f)}")
}
