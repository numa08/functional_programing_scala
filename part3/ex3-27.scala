def depth[A](node: Tree[A]): Int = node match {
  case Leaf(_) => 0
  case Branch(l, r) => 1 + depth(l) max depth(r)
}

def test() {
  val node = Branch(Branch(Branch(Leaf(0), Leaf(0)), Branch(Leaf(0), Leaf(0))), Leaf(100))
  println(s"depth is ${depth(node)}")
}
