//mathc expressions
//like Java switch but more powerful
//use _ as the catch all default
//it's an expression so can return a result
//no fall through - once match found it stops

val x = 1

x match {
  case 1 => println("it's one")
  case 2 => println("it's two")
  case _ => println("it's something else")
}

//return value
//lowest common boud is returned if different types in the cases
val result = x match {
  case 1 => "it's one"
  case 2 => "it's two"
  case _ => "it's something else"
}


//match expression guards
//use v as unknown value with if
//if the if is false & the => is not called, then it falls through to next

val n = -1

n match {
  case 0 => "it's zero"
  case v if v > 0 => s"it's positive $v"
  case v => s"it's negative ${v.abs}"
}


//multi match
def matchIt(x: Any): String = x match {
  case "Hello" => "Well hello there"
  case 1 :: rest => s"a list begining with 1, rest is $rest"
  case Nil => "the empty list"
  case 5 => "the number 5"
  case _: List[_] => "some kind of list, not empty & not starting with 1"
  case anythingElse => s"something else, $anythingElse"
}

matchIt(1)
matchIt(List(1,2,3))
matchIt(List(2,3))
matchIt(List())
matchIt(List(1))
matchIt(Nil)
matchIt(2.0)
