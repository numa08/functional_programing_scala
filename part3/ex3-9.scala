def length[A](as: List[A]): Int = 
  List.foldRight(l,0)((_, acc) => acc + 1)

def testLength(): Unit = {
  println(s"length(List(1,2,3,4,5) ${length(List(1,2,3,4,5))}")
  println(s"length(List(a,b,c,d,e) ${length(List("a","b","c","d","e"))}")
}
