//List (immutable linkedlist)
//performant when working at the head
val list = List(1, 2, 3)

//access element
val el1 = list(0)

println(el1)


//list also has the Cons operator to create new lists
//Nil is the empty list
Nil

//Nil has a method .::(1) which puts the 1 onto the head of the list
val newList = 1 :: 2 :: Nil
println(newList)


//anytime a :: is used, it's right associative
//Nil is required as :: is only available on Lists


//---------concat----------
val list1 = List(1, 2, 3, 4)
val list2 = List(5, 6, 7, 8)

//common mistake is to use ::
//this returns a list of Any
//this is because the first list gets put into the head as an item in the 2nd list
val list3 = list1 :: list2

//use the ::: instead
val list4 = list1 ::: list2
println(list4)
