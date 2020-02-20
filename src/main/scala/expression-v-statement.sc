/**
 * expressions have return values
 * statements do not (at least not a useful one)
 *
 * in functional programming, a pure expression has no effects other than those seen in the return value
 *
 * scala has no void keyword for expressions
 * void is the adsence of a return type
 * in scala, everything has a return type
 *
 * in scala, for statements, that return type is Unit
 *
 * referential transparency: you should be able to replace your function with
 * the result & it should not change the behaviour of your app (no side effects)
 */


//an expression
val x = 1 + 2         //x: Int = 3

//a statement
println(x)            // prints 3

//since everything has a return type
val unit = println(x)

//() is the only instance of Unit
//warning: comparing values of types Unit and Unit using == will always yield true
unit == ()