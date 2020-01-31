//scala can use the update method call to update elements
var array = Array("Test", "Update")
array(1) = "New Element"

println(array.mkString)

//behind the scenes, scala actually used this code
array.update(1, "new string")
println(array.mkString)


//only available with mutables / non-functional code
//object need to have the apply/update methods implemented in order to work