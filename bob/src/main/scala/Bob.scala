class Bob {
  def hey(s: String): String = s match {
    case s:String if isSilence(s) => "Fine. Be that way!"
    case s:String if isYelling(s) => "Whoa, chill out!"
    case s:String if isQuestioning(s) => "Sure."
    case _ => "Whatever."
  }

  def isQuestioning(s: String): Boolean = {
    s.endsWith("?")
  }

  def isYelling(s: String): Boolean = {
    s.exists(_.isLetter) && s == s.toUpperCase
  }

  def isSilence(s: String): Boolean = {
    s.trim.isEmpty
  }
}
