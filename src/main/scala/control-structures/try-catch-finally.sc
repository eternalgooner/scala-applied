//try blocks are expressions also
//the finally block however only has side-effects and does not effect the final return value

val divided = try {
  10/0
} catch {
  case ae: ArithmeticException => 0
} finally {
  println("This always runs, but does not affect the result")
  42                                    //this will not be returned ever
}