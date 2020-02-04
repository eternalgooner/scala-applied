//you can use sympolic method names to make code more readable
//acts as if operator (+ - / *)


class MyNumber(val x: Int){
  def +(other: MyNumber): MyNumber = new MyNumber(x + other.x)

  override def toString: String = s"MyNumber($x)"
}


val num1 = new MyNumber(2)
val num2 = new MyNumber(5)


//infix notation
//similar to num1.+(num2)
val total = num1 + num2

println(total)
