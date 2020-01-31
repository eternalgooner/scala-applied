//if expressions
val defaultName = "hello"
val args: Array[String] = Array.empty
var fileName = "default.txt"

if (args.length > 0) fileName = args(0)

//if is an expression so can assign return value from if
//this avoid the use of the fileName var
//the final expression in a code block is the return value - no need to explicitly say return
val newName = if (args.length > 0) args(0) else defaultName


//using the implicit return from an if helps avoid side-effects
//no state was changed, we just used the return value
//functional code avoids side-effects
def maxSquareDoubled(a: Int, b: Int) =
  if (a > b){
    val aSquared = a * a
    aSquared * 2                            // <= this is the potential return value
  }else{
    val bSquared = b * b
    bSquared * 2                            // <= this is the potential return value
  }

println(maxSquareDoubled(3, 9))