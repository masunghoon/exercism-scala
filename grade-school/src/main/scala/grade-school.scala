import collection.immutable.SortedMap

class School {
  var db: Map[Int, Seq[String]] = Map()

  def add(name: String, g: Int): Unit = {
    db += (g->(grade(g) :+ name))
  }

  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())

  def sorted = db.toSeq.sortBy(_._1).toMap.mapValues(_.sorted)
}

