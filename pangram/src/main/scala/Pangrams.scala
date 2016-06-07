/**
  * Created by masunghoon on 5/25/16.
  */
object Pangrams {
  def isPangram(s: String): Boolean =
//    s.toLowerCase.filter(c => c.isLetter).toSet.size == 26
    s.toLowerCase.filter(c => c >= 'a' && c <= 'z').toSet.size == 26

}
