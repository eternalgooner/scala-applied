//varargs used similarly to Java
//instead of ... the * is used
//varargs must be the last param

def greet (greeting: String, names: String*) = {
  for (name <- names)
  println(s"$greeting $name")
}

greet("hello")
greet("hello", "David")
greet("hello", "David", "John")
greet("hello", "David", "John", "Kev")


//if i want to pass a sequence of string i can use the expansion operator
// _* says to expand out this seq into strings
//useful in recursion
val names = List("jim", "jon", "jen")
greet("hello", names: _*)
