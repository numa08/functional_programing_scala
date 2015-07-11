def dropWhile[A](l : List[A], f : A => Boolean): List[A] = {
  l match {
    case Nil => Nil
    case Cons(h, t) if(f(h)) => dropWhile(t, f)
    case _ => l
  }
}

def testDropWhile() : Unit = {
  println(s"dropWhile(List(1,2,3,4,5,6) , x : Int => x < 5), ${dropWhile(List(1,2,3,4,5,6),(x : Int) =>  x < 5) == List(5,6)}")
}

