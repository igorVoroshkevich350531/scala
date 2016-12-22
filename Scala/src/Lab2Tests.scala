import org.scalatest.FunSuite

class Lab2Tests extends FunSuite{

  test("Expect to return List(3, 2, 1)") {
    val result = Lab2.reverseFoldLeft(List(1, 2, 3))
    assert(result == List(3, 2, 1))
  }

  test("Expect to return List(44, 55, 66)") {
    val result1 = Lab2.reverseFoldRight(List(66, 55, 44))
    assert(result1 == List(44, 55, 66))
    val result2 = Lab2.reverseMatch(List(66, 55, 44))
    assert(result2 == List(44, 55 ,66))
  }

  test("Expect to return List(44)") {
    val result1 = Lab2.reverseFoldRight(List(44))
    assert(result1 == List(44))
    val result2 = Lab2.reverseMatch(List(44))
    assert(result2 == List(44))
  }

  test("Expect to return an empty list") {
    val result1 = Lab2.reverseFoldLeft(List())
    assert(result1.isEmpty)
    val result2 = Lab2.reverseMatch(List())
    assert(result2.isEmpty)
  }

}
