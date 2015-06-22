def dropWile[A](l : List[A])(f : A => Boolean) : List[A] = l match {
  case Cons(h, t) if f(h) => dropWile(t)(f)
  case _ => l
}

def testDropWile() : Unit = {
  println(s"dropWile(List(1,2,3,4,5), (x : Int) => x < 4) == List(4,5) ${dropWile(List(1,2,3,4,5))(x => x < 4) == List(4,5)}")
}
