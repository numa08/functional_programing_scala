def map[A, B](node: Tree[A], f: A => B): Tree[B] = node match {
  case Leaf(v) => Leaf(f(v))
  case Branch(l, r) => Branch(map(l,f), map(r, f))
}

def test() {
  val node = Branch(Branch(Leaf(0), Leaf(-10)), Branch(Branch(Leaf(100), Leaf(99)), Leaf(2)))
  val f = (a: Int) => a * 2
  println(s"apply map ${map(node, f)}")
}
