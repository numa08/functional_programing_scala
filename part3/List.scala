sealed trait List[+A]
case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]) : Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }

  def foldRight[A,B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sum2(ns: List[Int]) =
    foldRight(ns, 0)(_ + _)

  def product2(ns: List[Double]) =
    foldRight(ns, 1.0)(_ * _)

  val x = List(1,2,3,4,5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }

  def append[A](a1 : List[A], a2 : List[A]) : List[A] =
    a1 match {
      case Nil => a2
      case Cons(h, t) => Cons(h, append(t, a2))
    }

  def foldLeft[A, B](as: List[A], z: B)(f: (A, B) => B) : B =
    as match {
      case Nil => z
      case Cons(x, xs) => foldLeft(xs, f(x, z))(f)
    }

    def map[A, B](as : List[A])(f : A => B) : List[B] = foldRight(as, List[B]())((a, l) => Cons(f(a), l))

    def mapTest() {
      println(s"map(List(1,2,3,4,5)(_ * 2)) == List(2,4,6,8,10) : ${map(List(1,2,3,4,5))(_ * 2) == List(2,4,6,8,10)}")
    }

    def filter[A](as : List[A])(f : A => Boolean) : List[A] = {
      def loop(as : List[A], ns : List[A]) : List[A] = as match {
        case Nil => ns
        case Cons(a, l) if (f(a)) => Cons(a, loop(l, ns))
        case Cons(a, l) => loop(l, ns)
      }
      loop(as, List[A]())
    }

    def filterTest() {
      println(s"filter(List(1,2,3,4,5,6,7,8))(_ % 2 == 0) ${filter(List(1,2,3,4,5,6,7,8))(_ % 2 == 0)}")
    }

    def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = foldRight(as, List[B]())((a, l) => append(f(a), l))
}
