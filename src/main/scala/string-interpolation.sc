//string interpolation techniques

val x = 10
val y = 2.12

val name = "Scala"

println(s"$name $x $y")


//---------- format --------------
//8 digits long with preceiding 0 if required. 4 decimal places
println(f"$name ${x * y}%08.4f")



//---------- multi-line --------------
//using " is allowed as compiler waiting for 3 "
val s = s"""This is a luti-line "String"
    |This is a new next line
    |name: $name
    |""".stripMargin
