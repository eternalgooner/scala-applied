//scala uses infix notation
//it is more readable and easier on the eye
// can be used when 1 param used

4 + 5

//is actually re-written as
4.+(5)

//another example
val s = "hello"
s charAt 1

//re-written as
s.charAt(1)

//map example
List(1, 2, 3).map(_ * 2)

//re-written as
List(1, 2, 3) map {_ * 2}


//it does not work if no param at the start