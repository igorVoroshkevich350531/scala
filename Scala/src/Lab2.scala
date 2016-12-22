// На языке Scala написать функцию reverse для списка.
// Реализовать эту функцию через foldRight (или foldLeft).
// reverse (List(1, 2, 3)) = List(3, 2, 1)

object Lab2 {
  /**
    * @param l list which should be reversed
    * @tparam A
    * @return reversed list
    */
  def reverseFoldLeft[A](l: List[A]): List[A] = {
    l.foldLeft(List[A]())((r, c) => c :: r)
  }

  /**
    *
    * @param l list which should be reversed
    * @tparam A
    * @return reversed list
    */
  def reverseFoldRight[A](l: List[A]): List[A] = {
    l.foldRight(List[A]())((c, r) => r :+ c)
  }

  /**
    *
    * @param l list which should be reversed
    * @tparam A
    * @return reversed list
    */
  def reverseMatch[A](l: List[A]): List[A] = l match {
    case head :: tail => reverseMatch(tail) :+ head
    case _ => List()
  }

}
