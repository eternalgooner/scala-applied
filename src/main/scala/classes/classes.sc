//class definitions
//no public keyword in scala
//all fields are public by default
//any code outside of def will be executed during object creation

class test

class MyAdditionClass{
  val x = 8;
  val y = 8;

  def addToFields(num: Int) = num + x + y
}

//fields are accessible using .notation
val newMyAdditionClass = new MyAdditionClass
println(newMyAdditionClass.y)
println(newMyAdditionClass.addToFields(3))


//constructor code (outside any def)
//constructor param is only available inside the class
//default constructor
class TestConstructorCall(name: String){
  println(s"during construction, new name: $name")
}

val newObj = new TestConstructorCall("david")


//declare field at same time of construction
//use val/var inline in constructor
//this class now has 2 fields declared with new instances
//parametric fields is the lingo
class ClassWithFields(val name: String, val age: Int)

