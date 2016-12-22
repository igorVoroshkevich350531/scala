import org.scalatest.FunSuite

class Lab1Tests extends FunSuite{

  test("Expect to return 10") {
    val result = Lab1.sqrtIter3(1, 1000)
    assert(result == 10)
  }

  test("Expect to return 10_Relative") {
    val result = Lab1.sqrtIter3_relative(1, 1000)
    assert(result == 10)
  }

  test("Expect to return 4.641588833612779E-4") {
    val result = Lab1.sqrtIter3(1, 1e-10)
    assert(result == 4.641588833612779E-4)
  }

  test("Expect to return 4.641588833612779E-4_Relative") {
    val result = Lab1.sqrtIter3_relative(1, 1e-10)
    assert(result == 4.641588833612779E-4)
  }

  test("Expect to return 4.6415888336127784E16") {
    val result = Lab1.sqrtIter3(1, 1e+50)
    assert(result == 4.6415888336127784E16)
  }

  test("Expect to return 4.6415888336127784E16_Relative") {
    val result = Lab1.sqrtIter3_relative(1, 1e+50)
    assert(result == 4.6415888336127784E16)
  }

}
