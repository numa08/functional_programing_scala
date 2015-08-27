def addOne(li : List[Int]) : List[Int] = List.foldRight(li, List[Int]())((a, l) => Cons(a + 1, l))

def test() {
  println(s"addOne(List(1, 2, 3, 4, 5)) = ${addOne(List(1, 2, 3, 4, 5))}")
}
