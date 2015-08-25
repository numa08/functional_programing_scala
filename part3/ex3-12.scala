def reverse[A](list : List[A]) : List[A] = List.foldLeft(list, List[A]())((a, l) => Cons(a, l))

def test() {
  val list = List(1, 2, 3, 4, 5)
  println(s"reverse($list) = ${reverse(list)}")
}
