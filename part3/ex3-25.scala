def size[A](node: Tree[A]) : Int = {
  def loop(size: Int, node: Tree[A]): Int = node match {
    case Leaf(_) => size + 1
    case Branch(l, r) => (size + 1) + loop(0, l) + loop(0, r)
  }
  loop(0, node)
}

def test() = {
  val node = Branch(Branch(Leaf(0), Leaf(1)),  Branch(Leaf(2), Branch(Leaf(3), Leaf(4))))
  println(s"node size is ${size(node)}")
}
