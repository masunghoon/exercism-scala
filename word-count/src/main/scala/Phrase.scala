/**
  * Created by masunghoon on 5/27/16.
  */
class Phrase(s: String) {
  def wordCount: Map[String, Int] = {
    val words = s.toLowerCase.split("[^a-z0-9']+")
    words.groupBy(w => w).mapValues(_.length)
  }
}

