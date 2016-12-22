package Lab1

object scala {
  
  def first(x : Double) : Double= {
    Math.pow( (-x/2), ( 1/3 ))
  }
  
  def second(x : Double) : Double = {
    Math.pow( (x/2), -2/3) / 6
  }
  
  def result (x : Double) : Double = {
    println(first(x))
    println(second(x))
    first(x) / second(x)
  }
  
  def main(args : Array[String]) {
    println(result(27))
  }
}
