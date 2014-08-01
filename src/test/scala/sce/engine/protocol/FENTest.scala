package sce.engine.protocol

import collection.mutable.Stack
import org.scalatest._

class FENTest extends FlatSpec with Matchers {
 // FEN := Figurenstellung " " Am Zug " " Rochade " " en passant " " Halbzüge " " Zugnummer
 // rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1
  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    } 
  }
}
