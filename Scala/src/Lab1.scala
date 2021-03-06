// Написать функцию вычисления кубического корня методом
// Ньютона по формуле ниже. Использовать функциональную
// декомпозицию. Протестировать функцию на очень больших и очень
// маленьких значениях. (x/y^2+2*y)/3

object Lab1 {

  // Проверка на точность происходит по формуле |guess_i+1 - guess_i| < (точность)
  // Если проверка удовлетворяет условие, то решение(кубическим корнем) будет являться guess_i+1
  // Если проверка не проходит, то мы снова "заводим" следующую итерацию, передавая ему guess_i+1
  def sqrtIter3 (guess : Double, x : Double) : Double = if (isGoodEnough3(guess, x)) improve3( guess, x )
  else sqrtIter3(improve3(guess, x), x)

  def sqrtIter3_relative (guess : Double, x : Double) : Double = if (isGoodEnough3_relative(guess, x)) improve3( guess, x )
  else sqrtIter3(improve3(guess, x), x)

  def isGoodEnough3( guess : Double, x : Double ) : Boolean = Math.abs(improve3(guess, x) - guess) < 1e-100 // Проверка решения(корня) на точность - абсолютная
  def isGoodEnough3_relative( guess : Double, x : Double ) : Boolean = Math.abs(improve3(guess, x) - guess) / guess * 100 < 1e-100 //Проверка решения(корня) на точность - относительная

  def improve3 (guess : Double, x : Double) = (x/(guess * guess) + 2 * guess) / 3 //Вычисление более точного значения кубического корня по заданному уравнению

}
