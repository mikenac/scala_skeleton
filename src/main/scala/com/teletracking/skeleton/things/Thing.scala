package com.teletracking.skeleton.things

import scala.util.{Try, Success, Failure}

class Thing {

  def multiply(item1: Int, item2: Int): Int = {
    item1 * item2
  }

// scalastyle:off println
  def divide(numerator: Int, denominator: Int): Try[Int] = {
    val problem = Try(numerator/denominator)
    problem match {
      case Success(v) =>
        println(s"The value is ${v}")
        problem
      case Failure(e) =>
        println(s"Failure: ${e.getMessage}")
        problem
    }
  }
  // scalastyle:on println

  def add(number1: Int, number2: Int): Int = {
    number1 + number2
  }
}
