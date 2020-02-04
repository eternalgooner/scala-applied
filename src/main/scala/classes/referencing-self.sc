//use the this keyword to reference self
//you can reference the this field without using this
//e.g. this.x can be written as just x

class CompareNums(val x: Int){
  def compare(other: CompareNums): CompareNums ={
    if (x < other.x) this else other
  }
}


val obj1 = new CompareNums(3)
val obj2 = new CompareNums(5)


//infix notation
//similar to obj1.compare(obj2)
val smaller = obj1 compare obj2