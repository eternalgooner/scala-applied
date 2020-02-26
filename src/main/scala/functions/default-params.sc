//params can be given default values
def addNums (a: Int = 1, b: Int = 2) = a + b

//default values are taken if none passed
addNums()
addNums(1, 4)

def checkThing(isCold: Boolean, isBroken: Boolean) = {
  println(s"Cold $isCold, Broken $isBroken")
}

//can call method just passing booleans which is hard to read
checkThing(true, false)

//can explicityly name params which is more readable
checkThing(isCold = true, isBroken = true)

//when naming params, the order doesn't matter
//they will be output in the order defined in method
checkThing(isBroken = false, isCold = false)
