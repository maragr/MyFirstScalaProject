import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year

import scala.io.StdIn.readLine

object MyAgeCalculatorMara extends App {
  val MyName = readLine ("What is Your name?")
  val MyAge = readLine ("What is Your Age: ").toInt
  val ThisYear = 2022
  val HundredYears = ThisYear-MyAge+100
  println (s"Dear $MyName, You will celebrate Your 100 at $HundredYears ")

}
