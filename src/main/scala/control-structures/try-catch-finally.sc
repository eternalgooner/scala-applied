//try blocks are expressions also
//the finally block however only has side-effects and does not effect the final return value
//the return type from try catch will be the closest common shared super type (finally not considered)
//example below return an Any type

val divided = try {
  10/0
} catch {
  case ae: ArithmeticException => "common super type"
} finally {
  println("This always runs, but does not affect the result")
  42                                    //this will not be returned ever
}


