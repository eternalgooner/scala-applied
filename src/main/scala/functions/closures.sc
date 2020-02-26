//all closures are function literals
//closures are a subgroup of function literals
//so called because it encloses around some state other than that passed in as params


//this is a function - only depends on its param
val incBy1 = (a: Int) => a + 1



val more = 6

//this is a closure - it depends on more than its param
val incByMore = (x: Int) => x + more

incByMore(10)
incByMore(10)


//in scala, closures can be used with vars - be careful
var change = 7

val incWithVar = (x: Int) => {
  change = change + 2
  x + change
}

//no referential transparency
//not functional as doesn't output same value when called with same input
incWithVar(9)
incWithVar(9)
incWithVar(9)