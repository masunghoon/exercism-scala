/**
  * Created by masunghoon on 5/25/16.
  */
class Anagram (val s: String) {
  val sCharMap = getCharMap(s)

  def getCharMap(word: String): Map[Char, Int] =
    word.toLowerCase.groupBy(c => c).mapValues(_.length)

  def isAnagram(word: String): Boolean =
    word.toLowerCase != s.toLowerCase && getCharMap(word) == sCharMap

  def matches(seq: Seq[String]): Seq[String] =
    seq.filter(isAnagram(_))
}
