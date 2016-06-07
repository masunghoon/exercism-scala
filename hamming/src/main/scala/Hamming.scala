/**
  * Created by masunghoon on 5/25/16.
  */
object Hamming {
  def compute(a: String, b: String): Int = {
    require(a.length == b.length, throw new IllegalArgumentException)

    def loop(aa: String, bb: String, acc: Int = 0): Int = (aa, bb) match {
      case ("", "") => acc
      case (aa: String, bb: String) => loop(aa.tail, bb.tail, if (aa.head == bb.head) acc else acc + 1)
    }
    loop(a, b, 0)
  }
}
