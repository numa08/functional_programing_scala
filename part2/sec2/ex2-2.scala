object Ex2_2 {

  def isSorted[A](as : Array[A], orderd: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n : Int, b : Boolean) : Boolean = {
      if (n >= as.length) true
      else if (b == false) false
      else loop(n + 1, orderd(as(n - 1), as(n)))
    }
    loop(1, true)
  }


  def main(args : Array[String]) : Unit = {
    val arr1 = Array(1, 4, 6)
    val arr2 = Array(6, 4, 1)
    val ord1 = (a : Int, b : Int) => a < b
    println(s"${arr1.mkString(",")} is sorted? : ${isSorted(arr1, ord1)}")
    println(s"${arr2.mkString(",")} is sorted? : ${isSorted(arr2, ord1)}")


    val arr3 = Array("a", "b", "c")
    val arr4 = Array("c", "b", "a")
    val ord2 = (a : String, b : String) => a.compareTo(b) < 0
    println(s"${arr3.mkString(",")} is sorted? : ${isSorted(arr3, ord2)}")
    println(s"${arr4.mkString(",")} is sorted? : ${isSorted(arr4, ord2)}")
  }
}
