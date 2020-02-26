//define function
//no need for {} it's optional
//= should always be included
//if no = used then Unit type return is default (procedure syntax)
def add(x: Int, y: Int) = x + y

//return type can be inferred or can be defined explicitly
//param types are required
def add2(x: Int, y: Int):Int = x + y

println(add(4, 5))


// -------Unit---------
//there is no void in Scala
//the equivalent in Unit
//any method with a Unit return type must have side-effects - otherwise it's useless
//as it can't return any data


//expressions are preferred over statements

//if func param is collection, the type must be declare
//the Any type can be used if you don't care what Type of List it is
def collectionSize (list: List[Any]): Int = list.size