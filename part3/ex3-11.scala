def sum(ints : List[Int]) : Int = List.foldLeft(ints, 0)(_ + _)

def product(ds : List[Double]) : Double = List.foldLeft(ds, 1.0)(_ * _)

def length[A](list : List[A]) : Int = List.foldLeft(list, 0)((_, a) => a + 1)

def test() {
  val list1 = List(1,2,3,4,5)
  println(s"sum(${list1}) = ${sum(list1)}")
  val list2 = List(1.0, 2.0, 3.0)
  println(s"product(${list2}) = ${product(list2)}")
  val list3 = List("a", "b", "c")
  println(s"length(${list3}) = ${length(list3)}")
}
