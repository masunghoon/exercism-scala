/**
  * Created by masunghoon on 6/2/16.
  */
class DNA(dna: String) {
  val nucleotideMap = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)

  require(dna.forall(nucleotideMap.contains))
  
  def addElement(map: Map[Char, Int], elem: Char) =
    map + (elem -> (map(elem) + 1))

  val nucleotideCounts = dna.foldLeft(nucleotideMap)(addElement)
}