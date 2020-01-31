//Tuples can return more than 1 type i.e. String & Int
//use () to create Tuple/Pair

//this function returns 2 ints as a Tuple
def sumAndDifference(a: Int, b: Int): (Int, Int) = {
  val sum = a + b
  val difference = a - b
  (sum, difference)
}

val result = sumAndDifference(3, 4)
println(result)

//to access the items in the Tuples, use the ._ notation
//Tuples index start at 1 (not 0 based)
println(result._1)
println(result._2)

//or create a val with meaningfil names
val (sum, diff) = sumAndDifference(9, 4)
println(sum)


//can be mixed values
val (a, b, c, d, e) = (0, 'u', 8, 1, "too")


//maximum size goes to 22