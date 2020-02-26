import java.time.LocalDate
//case classes are useful for pattern matching
//you also get a lot of extra implicit functionality for free
//no need for new keyword for instance creation (factory apply method)
//toString method included
//equals method included
//hashcode method included
//fields are public, no need for vals (parametric fields)

//almost like a data value structure - all public fields - immutable

case class Car(make: String, model: String, year: Int){
  lazy val isVintage: Boolean = LocalDate.now.getYear - year > 20
}

val mustang = Car("Ford", "Mustang", 1965)

mustang.make
mustang.model
mustang.year
mustang.isVintage


//comparison using == will work differently as the equals & hashcode methods are implemented
//this instance is equal even though it's a different instance
//without equals & haschode this would be false (different object references/identities)
mustang == Car("Ford", "Mustang", 1965)
mustang == Car("Ford", "Mustang", 1964)
