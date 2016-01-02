def zipWith[A](al: List[A], bl: List[A])(f: (A,A) => A) : List[A] = {
  def loop(l: List[A], al: List[A], bl: List[A]) : List[A] = (al, bl) match {
    case (Cons(a, al), Cons(b, bl)) => loop(List.append(l, List(f(a, b))), al, bl)
    case _ => l
  }
  loop(List[A](), al, bl)
}

def test() {
  val a = List(1,2,3)
  val b = List(4,5,6)
  val f = (a: Int,b: Int) => a + b
  println(s"zipWith(List(1,2,3), List(4,5,6))(_+_)= ${zipWith(a, b)(f)}")

}
