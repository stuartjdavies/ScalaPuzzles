package Scala.Rosaland

import org.scalatest._

class RnaPuzzleTest extends FlatSpec with Matchers {
  "Given the sampele data it " should " the expected data" in {
    RnaPuzzle.solve("GATGGAACTTGACTACGTAAATT") should be ("GAUGGAACUUGACUACGUAAAUU")
  }
}