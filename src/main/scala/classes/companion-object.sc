//companion objects are singletons
//they have the same name as the class
//they can share state & behaviour amongst each other
//equivalent to static in Java
//you can create the apply & update methods in here
//no need for new keyword when instantiating new object


//using private forces people to use the factory methods for creation
class MyObject(x:Int, s: String){

}


object MyObject {

  def apply(x: Int, s: String): MyObject = new MyObject(x, s)

  //factory method can contain code unlike aux constructor
  def apply(x: Int): MyObject = {
    println("in companion object instantiating...")
    new MyObject(x, "default string")
  }

}


//this allows creation without new keyword
val myObject = MyObject(1, "test")
val myObject2 = MyObject(2)