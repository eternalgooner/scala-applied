//implicit conversion can be used to convert different types
//use the import to avoid getting warnings
import scala.language.implicitConversions

class MyNum private(val x:Int, val y: Int){

  //symbolic method - adding one object to another
  def + (other: MyNum): MyNum = new MyNum((x + other.x), (y + other.y))
  
}


object MyNum {

  //factory method can contain code unlike aux constructor
  def apply(x: Int, y: Int): MyNum = {
    println("in companion object instantiating...")
    new MyNum(x, y)
  }

  implicit def apply(i: Int): MyNum = new MyNum(i, 2)

}


//can now add instance onto Int class as seen below
val newObj1 = MyNum(9, 1)
val newObj2 = newObj1 + 8
val nextOne = 7 + newObj1