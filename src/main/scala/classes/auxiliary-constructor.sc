//auxiliary constructors (overloaded constructor)
//can only call other constructors
//no code block allowed
//can only put some code inside the brackets call to this
//better alternative to use factory methods (companion object)

class AddTwo(x: Int, y: Int){

  //aux constructor
  def this(z: Int) = this(1, z)
}