//higher order functions are functions that take or return other functions
//if not higher order function, then called first order functions
//this is part of the power of functional language - pass a function to do some of the work
//some examples on the List data structure

val numMap = (1 to 10).toList

//map returns new list from func
numMap.map(x => x * x)

//filter takes predicate
numMap.filter(x => x < 4)

//span takes predicate and returns 2 different ranges
numMap.span(x => x % 4 != 0)

//partition takes predicate & returns 2 lists, matches => 1, non matches =>  2
numMap.partition(x => x % 4 != 0)

//sliding functions gives access to a sliding window of values
numMap.sliding(3) foreach(println(_))



//----------- writing higher order functions ---------------
//compare neighbours
def compareNeighbours(ls: List[Int], compare: (Int, Int) => Int) = {
  for (pair <- ls.sliding(2)) yield {
    compare(pair(0), pair(1))
  }
}.toList


//pass function that adds each neighbour
compareNeighbours(numMap, (a, b) => a + b)

//pass function that gets absolute difference between each neighbour
compareNeighbours((List(3, 8, 4, 1, 5, 5, 3)), (a, b) => (a - b).abs)
