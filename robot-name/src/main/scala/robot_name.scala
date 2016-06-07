import scala.util.Random

class Robot{
  var name: String = this.name match {
    case null => createName
    case _ => this.name
  }

  def reset() = {
    name = createName
  }

  def createName = {
    val random_code = Random.alphanumeric.take(2).mkString
    val random_no = Random.nextInt(999)
    f"${random_code}${random_no}%03d"
  }
}
