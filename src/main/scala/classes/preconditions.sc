

//--------------Preconditions-------------//
//used to check for valid params upon object creation
//throws IllegalArgumentException when false

class ObjectWithName(val name: String){
  require(name != "", "name must not be empty")
}

val invalidCreation = new ObjectWithName("")
