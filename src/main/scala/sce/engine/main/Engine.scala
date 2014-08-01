package sce.engine.main

object Engine extends App {
  
  var chessboard:Array[Byte] = Array[Byte](
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
   -1, 21, 22, 23, 24, 20, 23, 22, 21, -1,
   -1,  2,  2,  2,  2,  2,  2,  2,  2, -1,
   -1,  0,  0,  0,  0,  0,  0,  0,  0, -1,
   -1,  0,  0,  0,  0,  0,  0,  0,  0, -1,
   -1,  0,  0,  0,  0,  0,  0,  0,  0, -1,
   -1,  0,  0,  0,  0,  0,  0,  0,  0, -1,
   -1,  0,  0,  0,  0,  0,  0,  0,  0, -1,
   -1,  1,  1,  1,  1,  1,  1,  1,  1, -1,
   -1, 11, 12, 13, 14, 10, 13, 12, 11, -1)
  
  
  class Zugsgenerator {
    
    def generate(chessboard:Array[Byte]) = {
      var zuege:List[Zug] = List.empty
      var z = new Zug()
      chessboard(21) match {
        case WHITE.PAWN => {
          
        }
        case WHITE.TOWER =>
        case WHITE.SPRINGER =>
        case WHITE.LÄUFER =>
        case WHITE.KING =>
        case WHITE.QUEEN => 
        case default =>
      }
    }
    
    class Zug {
      var index = 0
      var zuege:List[Byte] = List.empty[Byte]
    }
  }
 
  object WHITE {
      val EMPTY_FIELD = 0
      val PAWN = 1
      val TOWER = 11
      val SPRINGER = 12
      val LÄUFER = 13
      val QUEEN = 14
      val KING = 10
      val ERROR_FIELD = -1
  }
  
  class BLACK  {
      val EMPTY_FIELD = 0
      val PAWN = 2
      val TOWER = 21
      val SPRINGER = 22
      val LÄUFER = 23
      val QUEEN = 24
      val KING = 20
      val ERROR_FIELD = -1
  }
  
}
