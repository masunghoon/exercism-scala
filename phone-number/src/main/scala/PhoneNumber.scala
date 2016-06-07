/**
  * Created by masunghoon on 6/1/16.
  */
class PhoneNumber(s: String) {

  val number = s.filter(_.isDigit) match {
    case num if num.length == 10 => num
    case num if num.length == 11 && num.head == '1' => num.tail
    case _ => "0000000000"
  }

  val (areaCode, localNumber) = number.splitAt(3)
  val (localHead, localTail) = localNumber.splitAt(3)

  override def toString = s"($areaCode) $localHead-$localTail"
}
