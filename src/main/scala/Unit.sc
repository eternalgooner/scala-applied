/**
 * Unit return type implies that a method must have a side effect to do something useful
 *
 * e.g. I/O, set or update a variable
 *
 * a non-Unit return type does not imply that there are no side effects however
 *
 * there is only one instance of Unit, it is ()
 * sometimes referred to as empty tuple
 *
 * Unit is descended from AnyVal, like the primitive types
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

//when calling a method with side effects it's convention to use the ()
//this tips off the reader that side effects are intended
//writer.close()

//can return this instead of unit to create fluent APIs