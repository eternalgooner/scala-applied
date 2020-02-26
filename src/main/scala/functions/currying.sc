//currying is like breaking down the function into small parts
//each part taking only 1 param
//this example will use a function that takes 3 params

val add3NumsFunc: (Int, Int, Int) => Int = (a, b, c) => a + b + c

//currify
val add3NumsCurried = add3NumsFunc.curried

add3NumsCurried(1)(2)(3)
