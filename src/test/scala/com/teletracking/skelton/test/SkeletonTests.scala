package com.teletracking.skelton.test

import com.teletracking.skeleton.things.Thing
import scala.util.{Try, Success, Failure}

class SkeletonTests extends UnitSpec {

  "2 multiplied by 2" should "equal 4" in {
    val da_thing = new Thing()
    assertResult(4) {
      da_thing.multiply(2, 2)
    }
  }

  "4 divided by 2" should "equal 2" in {
    val da_thing = new Thing()
    val ret = da_thing.divide(4, 2)
    assert(ret.getOrElse() == 2)

  }

  "4 divided by 2 multiplied by 2" should "equal 4" in {
    val da_thing = new Thing()
    val ret = da_thing.divide(4, 2)
    val product = ret.flatMap(v => Try(da_thing.multiply(v, 2)))
    assert(product.getOrElse() == 4)
  }

  "4 divided by 0" should "cause exception (divide by zero)" in {
    val da_thing = new Thing()
    val ret = da_thing.divide(4, 0)
    assert(ret.isFailure)
  }

  "4 divided by 0 multiplied by 2" should "case an error" in {
    val da_thing = new Thing()
    val ret = da_thing.divide(4, 0)
    val product = ret.flatMap(v => Try(da_thing.multiply(v, 2)))
    assert(product.isFailure)
  }

}
