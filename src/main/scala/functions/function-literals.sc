//function literals can also be called lambdas
//has no method signature


//normal method signature
def multFunc (a: Int, b: Int) = a * b

println(multFunc(3, 4))



//------- function literal / lambda --------
//use the rocket instead of =
val multFn = (a: Int, b: Int) => a * b

val result = multFn(8, 9)


//very handy & used often when wanting to pass function e.g. map
val nums = (1 to 5) toList

//returns List[Int]
nums.map(x => x * x)

//returns List{String]
nums.map(x => "add" * x)


//returns list of boolean
nums.map(x => x % 2 == 0)


//------- behind the scenes it looks like this ---------
val fn1: (Int, Int) => Int = (a, b) => a + b

//the above gets transformed by Scala into this
//new instance of Function2 created
//takes 2 params and last is return type
val fn2 = new Function2[Int, Int, Int] {
  override def apply(a: Int, b: Int) = a + b
}

//can call tupled on the function to combine args into 1 tuple (1 param)
val fnTuple = fn1.tupled
val tupe = (2, 3)
fnTuple(tupe)
