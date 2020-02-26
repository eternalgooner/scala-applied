//partial functions are functions that only partially satisfy the input
//they use matching with case

//this functions satisfies all int, positive & negative
//uses the catchall last case
val pf1: PartialFunction[Int, Int] = {
  case x: Int if x > 0 => x * x
  case x =>  x * -1
}

pf1(5)
pf1(-5)

val nums = (-5 to 5) toList

nums.map(pf1)


//-------- when no catchall used (partial param satisfied) -------------
//only 1 case for positive ints
val pf2: PartialFunction[Int, Int] = {
  case x: Int if x > 0 => x * x
}

//this throws March error as negative ints are not catered for
//nums.map(pf2)

//----------- collect ----------
//when a partial function is defined, it creates the apply & isDefinedAt methods
//however, the collect function can be used
//this applies the implicitly created function isDefinedAt before map
//looks like this
def isDefinedAt(x: Int) = x match {
  case x: Int if x > 0 => true
  case x => false
}

//this acts as a filter to only act on the true matches
//and then map those true matches
//this ensures that no match error is thrown
val res = nums.collect(pf2)

//-----------------
//match & catch use/are partial functions
val x = 5
x match {
  case 5 => "it's 5"
}

try (1/0)
catch {
  case ae: ArithmeticException => 0
}