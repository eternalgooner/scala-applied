//can partially complete a function

//define broader function
val add3Nums = (a:Int, b: Int, c: Int) => a + b + c

//define more specific function
val add3And6 = add3Nums(3, _, 6)

add3And6(5)
add3And6(9)


//can also use for all params
val v2 = add3Nums(_, _, _)
val res1 = v2(1, 3, 7)


//can be shortened further for methods
//saying use placeholder for all params
def add3Method (a:Int, b: Int, c: Int) = a + b + c
val v3 = add3Method _
val res2 = v3(3, 7, 8)


