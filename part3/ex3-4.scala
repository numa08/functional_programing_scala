def drop[A](l : List[A], n : Int) : List[A] = {
  if (n <= 0) l
  else l match {
    case Nil => Nil
    case Cons(_, t) => drop(t, n - 1)
  }
}

def testDrop() : Unit = {
  println(s"drop(List(1,2,3) 0) == List(1,2,3) ${drop(List(1,2,3), 0) == List(1,2,3)}")
  println(s"drop(List(1,2,3,4,5), 3) == List(4,5) ${drop(List(1,2,3,4,5), 3) == List(4,5)}")
  println(s"drop(List(a,b,c), 5) == Nil ${drop(List("a","b","c"), 5) == Nil}")
}
