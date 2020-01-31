//scala has only 1 true looping construct - the while
//while takes a predicate(boolean result) and evaluates it's value
//while is not functional as side-effects are needed
var x = 0

while (x < 5) {
  println(s"the square of $x is ${x * x}")
  x += 1
}


//also has a do while - always executing the first block at least once
do {
  println(s"the square of $x is ${x * x}")          //string interpolation
  x += 1
} while (x < 5)