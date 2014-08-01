package sce.engine.protocol.fen

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class Position extends FlatSpec with Matchers {
  // Figurenstellung := Reihe "/" Reihe "/" Reihe "/" Reihe "/" Reihe "/" Reihe "/" Reihe "/" Reihe
  // Reihe := { Figur | Leerfelder }+
  // Figur :=  "p" | "r" | "n" | "b" | "q" | "k" | "P" | "R" | "N" | "B" | "Q" | "K"
  // Leerfelder := "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8"
  // Beispiel: 8/8/8/2k5/4K3/8/8/8
  
  // rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1
  
  
  
}