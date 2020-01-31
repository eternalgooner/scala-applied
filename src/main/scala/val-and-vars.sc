//vals & vars are inferred
//no need to declare type

val age = 18                    //type inferred as Int
var name = "David"              //type inferred as String


//val is a final variable definition - it's value cannot be changed
// this is not allowed: age = 20

//var is a variable definition and it's value can change
name = "Scala"

//can't change type for a var
//name = 5 is not allowed as name is already a String

//val is usually the default & preferred usage for variables n Scala
//this helps with concurrency

//long declaration
var a: Int = 33
val x: String = "Test"

val x1, y1 = 100

//val x1 = y1 = 100 is not possible as Unit is returned after 1st assignment