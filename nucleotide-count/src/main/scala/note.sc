val dna = "GCCCCCT"

val nucleotideMap = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)

val nucleotides = nucleotideMap.keySet

require(dna forall nucleotides.contains)

def increaseMapCount(map: Map[Char, Int], key: Char) = {
  val increasedCount = map(key) + 1
  map + (key -> increasedCount)
}

//val nucleotideCounts = dna.foldLeft(nucleotideMap)(increaseMapCount)

val nucleotideCounts = increaseMapCount(increaseMapCount(increaseMapCount(increaseMapCount(nucleotideMap, 'G'),'A'),'C'),'G')

val n1 = increaseMapCount(nucleotideMap, 'G')
val n2 = increaseMapCount(n1, 'A')
val n3 = increaseMapCount(n2, 'C')
val n4 = increaseMapCount(n3, 'G')

def count2(a: Map[Char, Int], c: Char): Map[Char, Int] = a + (c -> (a(c) + 1))

val a1 = count2(nucleotideMap, 'A')
val a2 = count2(a1, 'A')
val a3 = count2(a2, 'C')

val aa = dna.foldLeft(nucleotideMap)(count2)

class DNA(dna: String) {
  val nucleotideSet = Set('A', 'T', 'C', 'G')


  def count(nucleotide: Char) = nucleotide -> dna.count(_ == nucleotide)

  lazy val nucleotideCounts = {
    println("test")
    nucleotideSet.map(count).toMap
  }
  require(dna.forall(nucleotideSet.contains))
}

new DNA("ACUG")


