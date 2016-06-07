val s = "abcdedfag"

s.toLowerCase.toList.groupBy(c => c).mapValues(_.length)

