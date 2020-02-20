//different ways to use for

for (i <- 1 to 10) println(i)

//the above for translates to this
1 to 10 foreach(i => println(i))

//without yield block, unit is return type


//with yield - return type inferred from collection used
//no side effects
var squares = for (i <- 1 to 10) yield i * i

//the above for gets translated to this
(1 to 10).map(i => i * i)


//the 4 Gs of For
//<- is the Generator
// if is the Guard
//inline assiGnment
//Give is the yield
val sums =
  for (i <- 1 to 10) {
    if (i == 5) {
      println(i)
    }
  }