def zipPlus(a: List[Int], b: List[Int]) : List[Int] = {
  def loop(l: List[Int], as: List[Int], bs: List[Int]) : List[Int] = (as, bs) match {
    case (Cons(a, al), Cons(b, bl)) => loop(List.append(l, List(a + b)), al, bl)
    case (Cons(a, al), Nil) => loop(List.append(l, List(a)), al, Nil)
    case (Nil, Cons(b, bl)) => loop(List.append(l, List(b)), Nil, bl)
    case _ => l
  }
  loop(List[Int](), a, b)
}

def test() {
  val a = List(1,2,3)
  val b = List(4,5,6)
  println(s"zipPlus(List(1,2,3), List(4,5,6) = ${zipPlus(a, b)})")
}
