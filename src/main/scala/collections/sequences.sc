//array & list are subtypes of seq
//sequences maintain the order that values are put into it
//this returns a List of Int
val seq = Seq(1, 2, 3)


//scala will tend to nudge you towards the immutable data structures
//you can use Seq as the suportype for Array, List, Vector
def getSize(data: Seq[Any]): Int = data.size