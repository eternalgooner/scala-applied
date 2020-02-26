case class Person(name: String, age: Int){}

val p1 = new Person("david", 38)
val p2 = new Person("david", 38)

p1.##
p2.##

p1 == p2
