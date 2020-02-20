//scala allows nesting of methods


//----- without nesting ------
object NestMethods {

  def getNamePlusGreeting(name: String) = {
    namePlusGreeting(name)
  }

  private def namePlusGreeting(str: String) = s"hello $str"
}

NestMethods.getNamePlusGreeting("david")


//----------- with nesting --------
object NestMethods2 {

  def getNamePlusGreeting(name: String) = {
    def namePlusGreeting() = s"hello $name"
    namePlusGreeting()
  }
}

NestMethods2.getNamePlusGreeting("tom")