def filter[A](as: List[A])(f: A => Boolean) = List.flatMap(as)(a => if(f(a)) List(a) else List[A]())

def test() {
  val l = List(1,2,3,4,5,6,7,8,9,10)
  val f = (a: Int) => a % 2 == 0
  println(s"filter(List(1,2,3,4,5,6,,7,8,9,10), (a: Int) => a / 2 == 0) = ${filter(l)(f)}")
}
