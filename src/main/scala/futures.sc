import scala.concurrent._
import ExecutionContext.Implicits.global

//-------------- Futures-------------//
val f1 = Future{Thread.sleep(100); 1}
val f2 = Future{Thread.sleep(900); 2}
val f3 = Future{Thread.sleep(500); 3}

//return 1 combined future from all 3 params
def futureInts(f1: Future[Int], f2: Future[Int], f3: Future[Int]): Future[Int] = {
  val aggFuture = for{
    f1Result <- f1
    f2Result <- f2
    f3Result <- f3
  }yield (f1Result + f2Result + f3Result)

  aggFuture
}

val fResult = futureInts(f1, f2, f3)
while (!fResult.isCompleted){}
println(fResult.value)