//-> is an extension method
//can be called on an instance of any type with one param of any other type
//the result is a Tuple[FirstType, SecondType]
//mainly sytactic sugar for creating maps
//not a keyword

1 -> "one"

//is re-written as
1.->("one")

//is then expanded to
ArrowAssoc(1).->("one")

"hello" -> 88
//returns (String, Int) Tuple