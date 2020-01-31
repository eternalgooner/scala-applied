//Scala uses the apply method to perform tranformations behind the scenes
//this makes a neater and nicer readable code

//when we create a new Array for example, the apply method is actually called which in turn uses the new keyword
val array = Array(1, 2, 3)

//same as
val array2 = Array.apply(1, 2, 3)


//it's the same when accessing array elements
val el1 = array(0)

//is the same as
val el2 = array.apply(0)
