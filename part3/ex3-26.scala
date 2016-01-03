def maximum(node: Tree[Int]): Int = {
  def loop(m: Int, node: Tree[Int]): Int = node match {
    case Leaf(i) => m.max(i)
    case Branch(l, r) => m.max(loop(0, l).max(loop(0, r)))
  }
  loop(0, node)
}

def test() {
  val node = Branch(Branch(Leaf(0), Leaf(-10)), Branch(Branch(Leaf(100), Leaf(99)), Leaf(2)))
  println(s"max is ${maximum(node)}")
}
