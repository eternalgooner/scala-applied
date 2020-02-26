//placeholder syntax can be used to shorten the code
//can be used to reference the element/thing
//can only be used once


val numMap = (1 to 10).toList

//filter takes predicate
numMap.filter(x => x < 4)

//with placeholder
numMap.map(_ < 4)

//-----------------------

//span takes predicate and returns 2 different ranges
numMap.span(x => x % 4 != 0)

//with placeholder
numMap.span(_ % 4 != 0)

//-----------------------

//partition takes predicate & returns 2 lists, matches => 1, non matches =>  2
numMap.partition(x => x % 4 != 0)

//with placeholder
numMap.partition(_ % 4 != 0)

//------------------------

//map returns new list from func
//cannot be used when referencing the element more than once
numMap.map(x => x * x)

//------------------------
//with placeholder for function literal
def compareNeighbours(ls: List[Int], compare: (Int, Int) => Int) = {
  for (pair <- ls.sliding(2)) yield {
    compare(pair(0), pair(1))
  }
  }.toList


//pass function that adds each neighbour
val res = compareNeighbours(numMap, _ + _)
//instead of
val res = compareNeighbours(numMap, (a, b) => a + b)


