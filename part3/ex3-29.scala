def fold[A, B](t: Tree[A])(f: A => B)(g :(B, B) => B): B = t match {
  case Leaf(a) => f(a)
  case Branch(l, r) => g(fold(l)(f)(g), fold(r)(f)(g))
}

def size[A](t: Tree[A]): Int =
  fold(t)(_ => 1)(1 + _ + _)

def maximum(t: Tree[Int]): Int =
  fold(t)(a => a)(_ max _)

def depth[A](t: Tree[A]): Int =
  fold(t)(_ => 0)((l, r) => 1 + (l max r))

def map[A, B](t: Tree[A])(f: A => B): Tree[B] =
  fold(t)(a => Leaf(f(a)): Tree[B])(Branch(_,_))

def test() {
  val node = Branch(Branch(Branch(Leaf(0), Leaf(0)), Branch(Leaf(0), Leaf(0))), Leaf(100))
  println(s"size is ${size(node)}")
  println(s"maximum is ${maximum(node)}")
  println(s"depth is ${depth(node)}")
  println(s"map to 2x ${map(node)(_ * 2)}")
}
