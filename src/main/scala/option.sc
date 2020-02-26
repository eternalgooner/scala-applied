//option can be used to avoid null pointer exceptions

val s1: String = "hello"
val s2: String = null

s1.length
//fails at runtime
//s2.length


//use option instead
val o1: Option[String] = Some("hello")
val o2: Option[String] = None

o1.map(_.length)
o2.map(_.length)


val numWords = Map(1 -> "one", 2 -> "two", 3 -> "three")
numWords(1)

//no such element exception
numWords(4)

//use .get instead
//numWords.get(4)
val word = numWords.get(4)
word.getOrElse("unknown")


//--------head option---------
//use head option to return safe values
//no need for condition checks when used like this
val list = List(1, 2, 3)

//dropping 2 & asking for the headoption in case nothing present
//returns empty list
list.drop(3)

//returns None if no element
list.drop(3).headOption

//return Some if element present
list.drop(2).headOption


