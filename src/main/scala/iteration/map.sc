//map iteration
//map is basically structure to hold pairs (tuples)

val map1 = Map(
  1 -> "step 1",
  2 -> "step 2",
  3 -> "step 3"
)

for((stepNum, stepInfo) <- map1)
  println(s"step num: $stepNum, stepInfo: $stepInfo")
