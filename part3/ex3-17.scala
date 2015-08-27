def dToString(li : List[Double]) : List[String] = List.foldRight(li, List[String]())((a, l) => Cons(a.toString, l))

def test() {
  println(s"dToString(List(1.0, 2.0, 3.0, 4.0)) = ${dToString(List(1.0, 2.0, 3.0, 4.0))}")
}
