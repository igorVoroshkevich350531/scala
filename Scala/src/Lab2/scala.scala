package Lab2

object Lab2 {

  def reverse[A](l: List[A]): List[A] = {
    l.foldLeft(List[A]())((r, c) => c :: r)
  }

  def reverse2[A](l: List[A]): List[A] = {
    l.foldRight(List[A]())((c, r) => r :+ c)
  }

  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 2, 3, 4, 5)))
    println(reverse2(List(1, 2, 3, 4, 5)))
  }

}
