//scala evaluates different types during different phases

//val is eagerly evaluated upon instance creation
//it will only evaluate once though & return the value each time its called

//def is evaluated each time its called

//lazy val is only evaluated when it is first called
//it will then return the value each time after that

class Demo{
  val a: Int = {
    println("evaluating val")
    10
  }

  def b:Int = {
    println("evaluating def")
    20
  }

  lazy val c: Int = {
    println("evaluating lazy val")
    30
  }
}

//only val is eagerly evaluated with new instance
val demo = new Demo

//def is evaluated every time it's called
demo.b
demo.b

//lazy val is only evaluated on its first call
//returns val each time thereafter
demo.c
demo.c

