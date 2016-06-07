val a = "First: don't laugh. Then: don't cry."

a.split("[^a-zA-Z0-9']+").groupBy(w => w).mapValues(_.length)
