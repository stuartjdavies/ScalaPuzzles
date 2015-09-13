package Scala.Rosaland

import org.scalatest._

class DnaPuzzleTest extends FlatSpec with Matchers {
  "Given the sampele data it " should " the expected data" in {
     new DnaPuzzle().solveDnaPuzzle("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC") should be (List(20,12,17,21))
  }
}
