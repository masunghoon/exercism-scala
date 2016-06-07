import collection.immutable.SortedMap

class School {
  var db: SortedMap[Int, Seq[String]] = SortedMap()

  def add(name: String, g: Int): Unit = {
    db = db ++ Map(g->(grade(g) :+ name))
  }

  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())

  def sorted = Map(db.toSeq.sortBy(_._1).map{ case (k, v) => (k, v.sortWith(_ < _)) } :_*)
}

