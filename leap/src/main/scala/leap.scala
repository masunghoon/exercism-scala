case class Year(val s: Int)  {
  def isLeap: Boolean = (s % 4) match {
    case 0 => if (s % 100 != 0 || s % 400 == 0) true else false
    case _ => false
  }
}
