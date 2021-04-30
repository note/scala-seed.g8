package example

import scala.compiletime.erasedValue
import scala.compiletime.ops.int._

@main
def hello(): Unit =
  println("Hello world!")

inline def repro[T <: Int with Singleton, U <: Int with Singleton]: Int = 
  inline erasedValue[T] match
    case _: 5 => 5
    case _    => 0

